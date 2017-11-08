package com.fyni.user;

import java.util.Date;

public class UserDTO {
	private int user_ID;
	private String user_PWD;
	private String user_Nickname;
	private Object user_Home;
	private int user_EXP;
	private boolean user_Profile;
	private Date user_Date;

	public UserDTO(int user_ID, String user_PWD, String user_Nickname, Object user_Home, int user_EXP,
			boolean user_Profile, Date user_Date) {
		super();
		this.user_ID = user_ID;
		this.user_PWD = user_PWD;
		this.user_Nickname = user_Nickname;
		this.user_Home = user_Home;
		this.user_EXP = user_EXP;
		this.user_Profile = user_Profile;
		this.user_Date = user_Date;
	}

	public UserDTO() {
		super();
	}

	public int getUser_ID() {
		return user_ID;
	}

	public void setUser_ID(int user_ID) {
		this.user_ID = user_ID;
	}

	public String getUser_PWD() {
		return user_PWD;
	}

	public void setUser_PWD(String user_PWD) {
		this.user_PWD = user_PWD;
	}

	public String getUser_Nickname() {
		return user_Nickname;
	}

	public void setUser_Nickname(String user_Nickname) {
		this.user_Nickname = user_Nickname;
	}

	public Object getUser_Home() {
		return user_Home;
	}

	public void setUser_Home(Object user_Home) {
		this.user_Home = user_Home;
	}

	public int getUser_EXP() {
		return user_EXP;
	}

	public void setUser_EXP(int user_EXP) {
		this.user_EXP = user_EXP;
	}

	public boolean isUser_Profile() {
		return user_Profile;
	}

	public void setUser_Profile(boolean user_Profile) {
		this.user_Profile = user_Profile;
	}

	public Date getUser_Date() {
		return user_Date;
	}

	public void setUser_Date(Date user_Date) {
		this.user_Date = user_Date;
	}

}
