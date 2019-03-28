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

//	@RequestMapping("/logout") 
//	public String getLogoutPage() {
//		return "indexPage"; 
//	}

	/*
	 * @RequestMapping("/changePassword") public String getChangePasswordPage() {
	 * return "changePasswordPage"; }
	 * 
	 * @RequestMapping("/createPost") public String getCreatePostPage() { return
	 * "createPostPage"; }
	 */

	@ModelAttribute
	public Profile getProfile() {
		profile=new Profile();
		return profile;
	}
}
