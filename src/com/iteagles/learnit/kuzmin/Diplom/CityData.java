package com.iteagles.learnit.kuzmin.Diplom;

public class CityData {

	private int cityId;
	private String cityName;

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	@Override
	public String toString() {
		return "CityData [CityId= " + cityId + ", CityName= " + cityName + "]";
	}
}
