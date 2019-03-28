package com.cg.capbook.services;

import java.security.spec.KeySpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Component;

@Component("encryption_decryption")
public class Encryption_Decryption {
	private static final String UNICODE_FORMAT = "UTF8";
	public static final String DESEDE_ENCRYPTION_SCHEME = "DESede";
	private KeySpec keySpec;
	private SecretKeyFactory secretKeyFactory;
	private Cipher cipher;
	byte[] arrayBytes;
	private String encryptionKey;
	private String encryptionScheme;
	SecretKey key;
	public Encryption_Decryption() throws Exception {
		encryptionKey = "ThisIsCapBookCodecThisIsCapBookCodec";
		encryptionScheme = DESEDE_ENCRYPTION_SCHEME;
		arrayBytes = encryptionKey.getBytes(UNICODE_FORMAT);
		keySpec = new DESedeKeySpec(arrayBytes);
		secretKeyFactory = SecretKeyFactory.getInstance(encryptionScheme);
		cipher = Cipher.getInstance(encryptionScheme);
		key = secretKeyFactory.generateSecret(keySpec);
	}
	public String encrypt(String unencryptedString) {
		String encryptedString = null;
		try {
			cipher.init(Cipher.ENCRYPT_MODE, key);
			byte[] plainText = unencryptedString.getBytes(UNICODE_FORMAT);
			byte[] encryptedText = cipher.doFinal(plainText);
			encryptedString = new String(Base64.encodeBase64(encryptedText));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return encryptedString;
	}
	public String decrypt(String encryptedString) {
		String decryptedText=null;
		try {
			cipher.init(Cipher.DECRYPT_MODE, key);
			byte[] encryptedText = Base64.decodeBase64(encryptedString);
			byte[] plainText = cipher.doFinal(encryptedText);
			decryptedText= new String(plainText);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return decryptedText;
	}
}