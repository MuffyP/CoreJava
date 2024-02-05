package com.edubridge.thiskeyworddemo;
//instance variable this keyword use
class Account{
	//instance variable
	public String accType;
	public long accno;
	
	public void SetData(String accType,long accno) {
		this.accType = accType;
		this.accno = accno;
	}
	public void Display() {
		System.out.println(accType+" "+accno);
	}
}
public class ThisKeywordDemoOne {

	public static void main(String[] args) {
		Account obj= new Account();
		obj.SetData("Savings", 979797797);
		obj.Display();
	}

}
