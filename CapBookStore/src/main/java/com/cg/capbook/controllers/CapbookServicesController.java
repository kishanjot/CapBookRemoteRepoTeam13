package com.cg.capbook.controllers;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.cg.capbook.beans.Profile;
import com.cg.capbook.exceptions.EmailAlreadyExistsException;
import com.cg.capbook.exceptions.InvalidEmailIdException;
import com.cg.capbook.exceptions.InvalidPasswordException;
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
		return new ModelAndView("userProfilePage","login",login); 
	}

	@RequestMapping("/logoutUser") 
	public ModelAndView logout() { 
		Profile profile=capbookServices.logout(); 
	return new ModelAndView("indexPage","profile",profile); 
	}



	/*
	 * @RequestMapping("/createPost") public ModelAndView
	 * createPost(@Valid@ModelAttribute Post post,BindingResult result) { Post
	 * post1=capbookServices.createPost(post); return new
	 * ModelAndView("createPostPage","post1",post1); }
	 */


}
