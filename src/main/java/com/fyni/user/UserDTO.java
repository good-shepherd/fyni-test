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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserDTO [user_ID=").append(user_ID).append(", user_PWD=").append(user_PWD)
				.append(", user_Nickname=").append(user_Nickname).append(", user_Home=").append(user_Home)
				.append(", user_EXP=").append(user_EXP).append(", user_Profile=").append(user_Profile)
				.append(", user_Date=").append(user_Date).append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((user_Date == null) ? 0 : user_Date.hashCode());
		result = prime * result + user_EXP;
		result = prime * result + ((user_Home == null) ? 0 : user_Home.hashCode());
		result = prime * result + user_ID;
		result = prime * result + ((user_Nickname == null) ? 0 : user_Nickname.hashCode());
		result = prime * result + ((user_PWD == null) ? 0 : user_PWD.hashCode());
		result = prime * result + (user_Profile ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDTO other = (UserDTO) obj;
		if (user_Date == null) {
			if (other.user_Date != null)
				return false;
		} else if (!user_Date.equals(other.user_Date))
			return false;
		if (user_EXP != other.user_EXP)
			return false;
		if (user_Home == null) {
			if (other.user_Home != null)
				return false;
		} else if (!user_Home.equals(other.user_Home))
			return false;
		if (user_ID != other.user_ID)
			return false;
		if (user_Nickname == null) {
			if (other.user_Nickname != null)
				return false;
		} else if (!user_Nickname.equals(other.user_Nickname))
			return false;
		if (user_PWD == null) {
			if (other.user_PWD != null)
				return false;
		} else if (!user_PWD.equals(other.user_PWD))
			return false;
		if (user_Profile != other.user_Profile)
			return false;
		return true;
	}

	
	
}
