package com.iteagles.learnit.kuzmin.Diplom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.iteagles.kuzmin.diplom.dao.TourDao;
import models.TourData;


public class DefaultTourDao implements TourDao {

	private static final String URL = "jdbc:mysql://localhost:3306/den_group10?useUnicode=true&serverTimezone=GMT%2b8";
	private static final String USER = "root";
	private static final String PASSWORD = "root";

	public static final String SELECT_TOUR_BY_NAME = "SELECT * FROM tours WHERE tour_name = ?";
	
	private static DefaultTourDao instance;

	public DefaultTourDao() {
	}

	public static synchronized DefaultTourDao getInstance() {
		if (instance == null) {
			instance = new DefaultTourDao();
		}
		return instance;
	}
	
	@Override
	public TourData getTourByName(String tourName) {
		TourData tourData = null;
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(SELECT_TOUR_BY_NAME)) {
				ps.setString(1, tourName);
				try (ResultSet rs = ps.executeQuery()) {
					while (rs.next()) {
						tourData = new TourData();
						tourData.setTourId(rs.getInt("tour_id"));
						tourData.setTourName(rs.getString("tour_name"));
						tourData.setCountryId(rs.getString("country_id"));
						tourData.setCityId(rs.getInt("city_id"));
						tourData.setHotelId(rs.getInt("hotel_id"));
						tourData.setTourDescription(rs.getString("tour_description"));
						tourData.setPrice(rs.getInt("price"));
						}
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tourData;
	}

	private Connection getConnection() {
		try {
			return DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
