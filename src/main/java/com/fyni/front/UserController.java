package com.fyni.front;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fyni.user.UserDTO;
import com.fyni.user.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService service;

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<String> resister(@RequestBody UserDTO dto) {
		ResponseEntity<String> entity = null;
		service.userCreate(dto);
		entity = new ResponseEntity<String>("Success", HttpStatus.OK);
		return entity;
	}

}
