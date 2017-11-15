package com.fyni.user;

import java.util.List;

public interface UserDAO {

	public int userCreate(UserDTO user);

	public UserDTO userRead(String user_ID);

	public int userUpdate(UserDTO user);

	public int userDelete(String user_ID);

	public List<UserDTO> userReadAll();

	public LoginDTO userSignIn(String User_ID, String User_PWD);
}
