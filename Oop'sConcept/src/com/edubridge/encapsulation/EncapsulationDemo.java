package com.edubridge.encapsulation;

public class EncapsulationDemo {
	public static void main(String[] args) {
		Customer c =new Customer();
		c.setBranch("Thane");
		c.setCustID(647632);
		c.setCustName("mufaddal plastic");
		c.setIFFCcode("HDFC00124");
		c.setPinNo(6767);
		System.out.println(c.getBranch());
		System.out.println(c);
	}
}
