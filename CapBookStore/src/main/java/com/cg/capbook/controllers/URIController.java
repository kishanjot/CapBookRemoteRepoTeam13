package com.cg.capbook.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cg.capbook.beans.Profile;

@Controller
public class URIController {
	private Profile profile;
	@RequestMapping(value={"/","index"})
	public String getIndexPage() {
		return "indexPage";
	}


	@RequestMapping("/uploadPic")
	public String uploadImage() {
		return "imageUploadPage";
	}

	@RequestMapping("/forgotPassword")
	public String forgotPasswordPage() {
		return "forgotPasswordPage";
	}
	
	@RequestMapping("/homePage")
	public String homePage() {
		return "userHomePage";
	}
	
	/*
	 * @RequestMapping("/resetPassword") public String changePasswordPage() { return
	 * "changePasswordPage"; }
	 */
	@ModelAttribute
	public Profile getProfile() {
		profile=new Profile();
		return profile;
	}
	
	
	
}
