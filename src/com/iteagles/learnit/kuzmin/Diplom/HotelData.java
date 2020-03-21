package com.iteagles.learnit.kuzmin.Diplom;

public class HotelData {
	private int hotelId;
	private String hotelName;
	private String hotelDescription;
	private int hotelStars;

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelDescription() {
		return hotelDescription;
	}

	public void setHotelDescription(String hotelDescription) {
		this.hotelDescription = hotelDescription;
	}

	public int getHotelStars() {
		return hotelStars;
	}

	public void setHotelStars(int hotelStars) {
		this.hotelStars = hotelStars;
	}

	@Override
	public String toString() {
		return "HotelData [HotelId= " + hotelId + ", HotelName= " + hotelName + ", HotelDescription= "
				+ hotelDescription + ", HotelStars= " + hotelStars + "]";
	}
}
