package com.edubridge.finaldemo;
//child class
// we cannot inherit a final class. for ex: if card had been final class we couldnt use that
public class Passport extends Card{
	private final String passportno="INS7857378";
	private String dateOfexpiry;
	public String getDateOfexpiry() {
		return dateOfexpiry;
	}
	public void setDateOfexpiry(String dateOfexpiry) {
		this.dateOfexpiry = dateOfexpiry;
	}
	public String getPassportno() {
		return passportno;
	}
	@Override
	public String toString() {
		return "Passport [passportno=" + passportno + ", dateOfexpiry=" + dateOfexpiry + ", toString()="
				+ super.toString() + "]";
	}
	
}
