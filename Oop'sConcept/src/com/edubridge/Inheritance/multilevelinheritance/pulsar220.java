package com.edubridge.Inheritance.multilevelinheritance;

public class pulsar220 extends pulsar180 {
	public int Speed;
	public int price;
	
	public pulsar220(int speed, int price) {
		super(speed, price);
		this.Speed= speed;
		this.price= price;
		super.price=150000;
		super.Speed=65;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "pulsar220 [Speed=" + Speed + ", price=" + price + ", toString()=" + super.toString() + "]";
	}
	

}
