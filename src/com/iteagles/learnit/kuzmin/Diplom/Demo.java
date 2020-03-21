package com.iteagles.learnit.kuzmin.Diplom;

import com.iteagles.kuzmin.diplom.dao.DefaultUserDao;
import com.iteagles.kuzmin.diplom.dao.UserDao;
import com.iteagles.kuzmin.diplom.dao.TourDao;
import com.iteagles.kuzmin.diplom.dao.TourUserDao;

import com.iteagles.kuzmin.diplom.dao.DefaultTourDao;
import models.TourData;
import models.UserData;

public class Demo {

	public static void main(String[] args) {
		UserDao userDao = DefaultUserDao.getInstance();
		UserData user = userDao.getUserById(2);
		System.out.println(user);

		TourDao tourDao = new DefaultTourDao();
	    TourData tour = tourDao.getTourByName("Varadero");
	    System.out.println(tour);

	}
}