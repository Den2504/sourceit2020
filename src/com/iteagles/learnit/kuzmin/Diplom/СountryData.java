package com.iteagles.learnit.kuzmin.Diplom;

public class СountryData {
	private int countryId;
	private String countryName;

	public int getContryId() {
		return countryId;
	}

	public void setContryId(int contryId) {
		this.countryId = contryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return "CityData [CountryId= " + countryId + ", CountryName= " + countryName + "]";
	}
}
