package com.edubridge.finaldemo;

public class Card {
	private  String cardName;
	//we can sety or chnage then value of final variable cant use getter and setter
	private final String issuer="GOI";
	public String getIssuer() {
		return issuer;
	}
	
	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	@Override
	public String toString() {
		return "Card [cardName=" + cardName + ", issuer=" + issuer + "]";
	}
	

}
