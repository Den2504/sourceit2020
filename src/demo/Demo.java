package demo;

import com.iteagles.kuzmin.diplom.dao.DefaultUserDao;
import com.iteagles.kuzmin.diplom.dao.UserDao;

import models.UserData;

public class Demo {
	
	public static void main(String[] args) {
		UserDao userDao = new DefaultUserDao();
		UserData user = userDao.getUserById(3);
		System.out.println(user);
	}

}
