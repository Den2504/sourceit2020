package com.iteagles.learnit.kuzmin.Diplom;

import models.TourData;
import models.UserData;

public interface TourUserDao {

	TourData getTourByUserId(int userId);
}