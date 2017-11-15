package com.fyni.front;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fyni.user.UserDTO;
import com.fyni.user.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService service;

	// for service admin
	@RequestMapping(value = "/listuser")
	public ModelAndView listUser() {
		List<UserDTO> list = service.userReadAll();
		System.out.println(list);
		ModelAndView mav = new ModelAndView();
		mav.addObject("userList", list);
		mav.setViewName("listuser");
		return mav;
	}

	// for customer
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signUp(UserDTO dto, Model model) {
		model.addAttribute("result", service.userCreate(dto));
		return "signup";
	}

//	@RequestMapping(value = "/signin", method = RequestMethod.POST)
//	public ModelAndView signIn(String user_ID, String user_PWD, ModelAndView mav) {
//		String id = service.userSignIn(user_ID, user_PWD);
//
//		if (id != null) {
//		} else {
//
//		}
//
//		return mav;
//	}

}
