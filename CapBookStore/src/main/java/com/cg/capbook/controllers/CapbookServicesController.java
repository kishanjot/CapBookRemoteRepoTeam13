package com.cg.capbook.controllers;

import java.util.List;

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
import com.cg.capbook.beans.Post;
import com.cg.capbook.beans.Profile;
import com.cg.capbook.exceptions.EmailAlreadyExistsException;
import com.cg.capbook.exceptions.IncorrectSecurityAnswer;
import com.cg.capbook.exceptions.IncorrectSecurityQusetion;
import com.cg.capbook.exceptions.InvalidEmailIdException;
import com.cg.capbook.exceptions.InvalidPasswordException;
import com.cg.capbook.exceptions.NoUserFoundException;
import com.cg.capbook.exceptions.PasswordMismatchException;
import com.cg.capbook.exceptions.UserDetailsNotFoundException;
import com.cg.capbook.exceptions.UserIsNotYourFriendException;
import com.cg.capbook.services.CapbookServices;
import com.cg.capbook.services.PostServices;

@Controller
@SessionAttributes("login")
public class CapbookServicesController {

	@Autowired
	CapbookServices capbookServices;

	@Autowired
	PostServices postServices;
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
    
    @RequestMapping("/showAllFriendRequests")
	public ModelAndView showFriendRequests(@SessionAttribute("login") Profile profile)throws InvalidEmailIdException{
		List<Friend> allfriendRequests=capbookServices.showAllFriendRequests(profile.getEmailId());
		if(allfriendRequests==null)
			return new ModelAndView("friendRequestPage", "allfriendRequests","You don't have any friend requests!");
		else
		return new ModelAndView("friendRequestPage", "allfriendRequests",allfriendRequests);
	}
    
    @RequestMapping("/sendFriendRequest")
	public ModelAndView sendFriendRequest(@RequestParam String receiverId,@SessionAttribute("login") Profile profile)throws InvalidEmailIdException, UserIsNotYourFriendException, NoUserFoundException{	
		if(profile.getEmailId().equalsIgnoreCase(receiverId)) {
			return new ModelAndView("userProfilePage", "status", "You cannot send Friend Request to yourself !");
		}
			else {
			Friend friend=capbookServices.findFriendRequest(profile.getEmailId(), receiverId);
			if(friend==null) {
				capbookServices.sendFriendRequest(profile.getEmailId(), receiverId);
			return new ModelAndView("userProfilePage", "status", "Friend Request sent Successfully!");
			}
			else {
					if(friend.getStatus().equalsIgnoreCase("Pending.."))
							return new ModelAndView("userProfilePage", "status", "Friend Request has already been sent !");
					if(friend.getStatus().equalsIgnoreCase("Rejected.."))
						return new ModelAndView("userProfilePage", "status", "The user rejected your request!");
					else
						return new ModelAndView("userProfilePage", "status", "User is already in your friend list !");
			}
		}
	}
    
    @RequestMapping("/acceptFriendRequest")
	public ModelAndView acceptFriendRequest(@SessionAttribute("login") Profile profile,@RequestParam String senderId)throws InvalidEmailIdException, NoUserFoundException{
		capbookServices.confirmFriendRequest(senderId, profile.getEmailId());
		List<Friend> allfriendRequests=capbookServices.showAllFriendRequests(profile.getEmailId());
		return new ModelAndView("friendRequestPage", "allfriendRequests",allfriendRequests);
	}
	
    @RequestMapping("/rejectFriendRequest")
	public ModelAndView rejectFriendRequest(@SessionAttribute("login") Profile profile,@RequestParam String senderId)throws InvalidEmailIdException, UserIsNotYourFriendException{
    	capbookServices.rejectFriendRequest(senderId, profile.getEmailId());
		List<Friend> allfriendRequests=capbookServices.showAllFriendRequests(profile.getEmailId());
		return new ModelAndView("friendRequestPage", "allfriendRequests",allfriendRequests);
	}
    
    @RequestMapping("/showAllFriends")
	public ModelAndView showAllFriends(@SessionAttribute("login") Profile profile)throws InvalidEmailIdException, UserIsNotYourFriendException{
		List<Friend> allfriends=capbookServices.showAllFriends(profile.getEmailId());
		return new ModelAndView("friendsPage", "allfriends",allfriends);
	}
    
    
    @RequestMapping("/updatePost")
	public ModelAndView updatePost(@RequestParam String postMessage ,@SessionAttribute("login") Profile profile) throws InvalidEmailIdException {
		postServices.savePost(profile.getEmailId(), postMessage);
		List<Post> posts=postServices.ShowAllPosts(profile.getEmailId());
		return new ModelAndView("userHomePage", "posts", posts);
	}
    
@RequestMapping("/showAllPosts")
	public ModelAndView showAllPosts(@SessionAttribute("login") Profile profile) throws InvalidEmailIdException {
		List<Post> posts=postServices.ShowAllPosts(profile.getEmailId());
		System.out.println(posts);
		return new ModelAndView("userHomePage", "posts", posts);
	}
}
