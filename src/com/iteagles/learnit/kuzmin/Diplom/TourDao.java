package com.iteagles.learnit.kuzmin.Diplom;


import models.TourData;


public interface TourDao {
	TourData getTourByName(String tourName);
}
