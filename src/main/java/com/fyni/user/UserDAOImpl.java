package com.fyni.user;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {

	@Inject
	private SqlSession session;
	private static String namespace = "com.fyni.mapper.userMapper";

	@Override
	public int userCreate(UserDTO user) {
		return session.insert(namespace + ".userCreate", user);
	}

	@Override
	public UserDTO userRead(String user_ID) {
		return session.selectOne(namespace + ".userRead", user_ID);
	}

	@Override
	public int userUpdate(UserDTO user) {
		return session.update(namespace + ".userUpdate", user);
	}

	@Override
	public int userDelete(String user_ID) {
		return session.delete(namespace + ".userDelete", user_ID);
	}

	@Override
	public List<UserDTO> userReadAll() {
		return session.selectList(namespace + ".userReadAll");
	}

}
