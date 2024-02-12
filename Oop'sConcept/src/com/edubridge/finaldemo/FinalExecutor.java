package com.edubridge.finaldemo;

public class FinalExecutor {

	public static void main(String[] args) {
		Passport p = new Passport();
		p.setDateOfexpiry("26/07/2027");
		p.setCardName("Passport");
		System.out.println("Card Name: "+p.getCardName()+"\nDate of Expiry "+p.getDateOfexpiry());
	}

}
