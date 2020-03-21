package com.iteagles.learnit.kuzmin.Diplom;

import java.sql.Date;

public class TourData {
	private int tourId;
	private String tourName;
	private String countryId;
	private int cityId;
	private int hotelId;
	private String tourDescription;
	private Date departureDate; /// ????
	private Date arrivalDate;
	private int price;

	public int getTourId() {
		return tourId;
	}

	public void setTourId(int tourId) {
		this.tourId = tourId;
	}

	public String getTourName() {
		return tourName;
	}

	public void setTourName(String tourName) {
		this.tourName = tourName;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getTourDescription() {
		return tourDescription;
	}

	public void setTourDescription(String tourDescription) {
		this.tourDescription = tourDescription;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "TourData [TourId= " + tourId + ", TourName= " + tourName + ", CountryId= " + countryId + ", CityId="
				+ cityId + ", HotelId= " + hotelId + ", TourDescription= " + tourDescription + ", DepartureDate= "
				+ departureDate + ", ArrivalDate= " + arrivalDate + ", Price= " + price + "]";
	}

}
