package com.cg.capbook.controllers;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import com.cg.capbook.beans.Friend;
import com.cg.capbook.beans.Profile;
import com.cg.capbook.exceptions.EmailAlreadyExistsException;
import com.cg.capbook.exceptions.IncorrectSecurityAnswer;
import com.cg.capbook.exceptions.IncorrectSecurityQusetion;
import com.cg.capbook.exceptions.InvalidEmailIdException;
import com.cg.capbook.exceptions.InvalidPasswordException;
import com.cg.capbook.exceptions.NoUserFoundException;
import com.cg.capbook.exceptions.PasswordMismatchException;
import com.cg.capbook.exceptions.UserDetailsNotFoundException;
import com.cg.capbook.services.CapbookServices;

@Controller
@SessionAttributes("login")
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
	@RequestMapping("/editProfile") public ModelAndView editProfile( @SessionAttribute("login") Profile login) {
		return new ModelAndView("userProfilePage","profile",login);
	}
	@RequestMapping("/logoutUser") 
	public ModelAndView logout() throws NoUserFoundException{ 
		capbookServices.logout(); 
		return new ModelAndView("logoutSuccessPage","profile",null); 
	}

	//@RequestMapping("/savefile")
	//public ModelAndView uploadImage(@RequestParam MultipartFile file, HttpSession session) throws UserDetailsNotFoundException, NoUserFoundException {
	//	return new ModelAndView("imageUploadPage", "profile", capbookServices.addProfilePic((String) session.getAttribute("emailId"), file));
	//}
	
	@RequestMapping("/savefile") public ModelAndView editPic( @RequestParam MultipartFile file ,@SessionAttribute("login") Profile login)throws UserDetailsNotFoundException, NoUserFoundException {
		capbookServices.addProfilePic(login.getEmailId(), file);
		return new ModelAndView("userHomePage","profile",login);
	}
	
	@RequestMapping("/forgotPasswordAct")
	public ModelAndView forgotPasswordAct(@RequestParam String emailId,@RequestParam String password, String securityQstn,@RequestParam String securityAns) throws UserDetailsNotFoundException, IncorrectSecurityAnswer, NoUserFoundException, IncorrectSecurityQusetion {
		return new ModelAndView("forgotPasswordPage", "profile", capbookServices.forgotPassword(emailId, password, securityQstn, securityAns));
	}
	
	@RequestMapping("/changePassword")
	public ModelAndView changePassword(String emailId, String password, String newPassword,String confirmNewPwd) throws UserDetailsNotFoundException,PasswordMismatchException, NoUserFoundException {
		return new ModelAndView("changePasswordPage", "profile", capbookServices.changePassword(emailId, password, newPassword, confirmNewPwd));
	}
	
	@RequestMapping("/addFriend")
	public ModelAndView addFriend(String emailId, Friend friend) throws UserDetailsNotFoundException, NoUserFoundException {
		return new ModelAndView("userHomePage", "profile", capbookServices.addFriend(emailId, friend));
	}
	
	@RequestMapping("/updateInfoFirstName") public ModelAndView editupdateInfoFirstName(@SessionAttribute("login") Profile login,@RequestParam String firstName) throws Exception {
		if(firstName.equalsIgnoreCase(""))
			return new ModelAndView("userProfilePage","profile",login);
		else {
			login.setFirstName(firstName);
			login=capbookServices.update(login);
			return new ModelAndView("userProfilePage","profile",login);
		}
	} 
	@RequestMapping("/updateInfoLastName") public ModelAndView editupdateInfoLastName(@SessionAttribute("login") Profile login,@RequestParam String lastName) throws Exception {
		if(lastName.equalsIgnoreCase(""))
			return new ModelAndView("userProfilePage","profile",login);
		else {
			login.setLastName(lastName);
			login=capbookServices.update(login);
			return new ModelAndView("userProfilePage","profile",login);
		}
	} 
    
    @RequestMapping("/updateInfoDOB") public ModelAndView editupdateInfoDOB(@SessionAttribute("login") Profile login,@RequestParam String DOB) throws Exception {
		if(DOB.equalsIgnoreCase(""))
			return new ModelAndView("userProfilePage","profile",login);
		else {

			login.setDateOfBirth(DOB);
			login=capbookServices.update(login);
			return new ModelAndView("userProfilePage","profile",login);
		}
	} 
    @RequestMapping("/updateInfoCity") public ModelAndView editupdateInfoCity(@SessionAttribute("login") Profile login,@RequestParam String city) throws Exception {
		if(city.equalsIgnoreCase(""))
			return new ModelAndView("userProfilePage","profile",login);
		else {
			login.setCity(city);
			login=capbookServices.update(login);;
			return new ModelAndView("userProfilePage","profile",login);
		}
	} 
    @RequestMapping("/updateInfoCountry") public ModelAndView editupdateInfoCountry(@SessionAttribute("login") Profile login,@RequestParam String country) throws Exception {
		if(country.equalsIgnoreCase(""))
			return new ModelAndView("userProfilePage","profile",login);
		else {
			login.setCountry(country);
			login=capbookServices.update(login);
			return new ModelAndView("userProfilePage","profile",login);
		}
	} 
	
	
	
}
