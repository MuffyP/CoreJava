package com.edubridge.encapsulation;
//child class
public class Customer extends HDFC{
	
	private String custName;
	private long custID;
	private int pinNo;
	
	//getter and setter
	public String getCustName() {
		return custName;
	}


	public void setCustName(String custName) {
		this.custName = custName;
	}


	public long getCustID() {
		return custID;
	}


	public void setCustID(long custID) {
		this.custID = custID;
	}


	public int getPinNo() {
		return pinNo;
	}


	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	

	// generating tostring method using inherited tstring
	@Override
	public String toString() {
		return "Customer [custName=" + custName + ", custID=" + custID + ", pinNo=" + pinNo + ", toString()="
				+ super.toString() + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
