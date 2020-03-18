package com.iteagles.kuzmin.diplom.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import models.UserData;
import com.iteagles.kuzmin.diplom.dao.UserDao;

public class DefaultUserDao implements UserDao {
	
	private static final String SELECT_USER_BY_ID = "SELECT * FROM users WHERE user_id = ?";
	private static final String URL = "jdbc:mysql://localhost:3306/den_group10?useUnicode=true&serverTimezone=GMT%2b8";
	private static final String USER = "root";
	private static final String PASSWORD = "root";

	@Override
	public UserData getUserById(int userId) {
		UserData user = null;
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(SELECT_USER_BY_ID)) {
			
			ps.setInt(1, userId);
			try (ResultSet rs = ps.executeQuery();) {	
				if (rs.next()) {
				    user = new UserData();
					user.setLastName(rs.getString("last_name"));
					user.setFirstName(rs.getString("first_name"));
					user.setMiddleName(rs.getString("middle_name"));
					user.setUserId(rs.getInt("user_id"));
					user.setBirthday(rs.getDate("birthday"));
					//user.setRole(roleDao.getRoleById(rs.getInt("role_id")));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	private Connection getConnection() {
		try {
			return DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
