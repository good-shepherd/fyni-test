package com.fyni.test;

<<<<<<< HEAD
import java.sql.Connection;
import java.sql.SQLException;

=======
>>>>>>> master
import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
<<<<<<< HEAD
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
>>>>>>> master
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

<<<<<<< HEAD
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
@WebAppConfiguration
public class DAOTest {

	@Inject
	private DataSource ds;

	/*
	 * @Test public void testRead() throws Exception {
	 * 
	 * System.out.println(dao.userRead("아이디야")); }
	 */

	@Test
	public void testFactory() {

		Connection con = null;
		try {
			con = ds.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(con);
	}

=======
import com.fyni.user.UserDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/**/servlet-context.xml"})
@WebAppConfiguration
public class DAOTest {
 
	
	@Autowired
	@Qualifier("userDao")
	private UserDAO dao;
	
	@Test
	public void testRead() throws Exception{
		System.out.println(dao.userRead("CDH"));
	}
>>>>>>> master
}
