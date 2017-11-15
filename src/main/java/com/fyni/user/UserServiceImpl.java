package com.fyni.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	@Qualifier("userDao")
	private UserDAO dao;

	@Override
	public int userCreate(UserDTO user) {
		return dao.userCreate(user);
	}

	@Override
	public UserDTO userRead(String user_ID) {
		return dao.userRead(user_ID);
	}

	@Override
	public int userUpdate(UserDTO user) {
		return dao.userUpdate(user);
	}

	@Override
	public int userDelete(String user_ID) {
		return dao.userDelete(user_ID);
	}

	@Override
	public List<UserDTO> userReadAll() {
		return dao.userReadAll();
	}

	@Override
	public LoginDTO userSignIn(String user_ID, String user_PWD) {
		return dao.userSignIn(user_ID, user_PWD);
	}

}
