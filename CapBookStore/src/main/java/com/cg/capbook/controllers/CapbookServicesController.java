package com.cg.capbook.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import com.cg.capbook.beans.Profile;
import com.cg.capbook.exceptions.BothPasswordsSameException;
import com.cg.capbook.exceptions.EmailAlreadyExistsException;
import com.cg.capbook.exceptions.IncorrectSecurityAnswer;
import com.cg.capbook.exceptions.InvalidEmailIdException;
import com.cg.capbook.exceptions.InvalidPasswordException;
import com.cg.capbook.exceptions.NoUserFoundException;
import com.cg.capbook.exceptions.UserDetailsNotFoundException;
import com.cg.capbook.services.CapbookServices;

@Controller
public class CapbookServicesController {

	@Autowired
	CapbookServices capbookServices;

	@RequestMapping("/registerUser")
	public ModelAndView registerUser(@Valid @ModelAttribute Profile profile, BindingResult result)
			throws EmailAlreadyExistsException {
		if (result.hasErrors())
			return new ModelAndView("indexPage");
		profile = capbookServices.signUpUser(profile);
		return new ModelAndView("registrationSuccessPage", "profile", profile);
	}


	@RequestMapping("/loginUser")
	public ModelAndView loginUser( @RequestParam String emailId,@RequestParam String password) throws InvalidEmailIdException, InvalidPasswordException {
		Profile login =capbookServices.loginUser(emailId,password); 
		return new ModelAndView("userHomePage","login",login); 
	}

	@RequestMapping("/logoutUser") 
	public ModelAndView logout() throws NoUserFoundException{ 
		capbookServices.logout(); 
		return new ModelAndView("logoutSuccessPage","profile",null); 
	}

	@RequestMapping("/uploadImage")
	public ModelAndView uploadImage(@RequestParam MultipartFile file, HttpSession session) throws UserDetailsNotFoundException, NoUserFoundException {
		return new ModelAndView("imageUploadPage", "profile", capbookServices.addProfilePic((String) session.getAttribute("emailId"), file));
	}

	@RequestMapping("/forgotPasswordAct")
	public ModelAndView forgotPasswordAct(@RequestParam String emailId,String password,String securityQstn, String securityAns) throws UserDetailsNotFoundException, IncorrectSecurityAnswer, NoUserFoundException {
		return new ModelAndView("ForgotAndResetPasswordPage", "profile", capbookServices.forgotPassword(emailId, password, securityQstn, securityAns));
	}
	
	@RequestMapping("/changePassword")
	public ModelAndView changePassword(@RequestParam String emailId, String password) throws UserDetailsNotFoundException, IncorrectSecurityAnswer, BothPasswordsSameException, NoUserFoundException {
		return new ModelAndView("indexPage", "profile", capbookServices.changePassword(emailId, password));
	}

}
