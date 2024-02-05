package com.edubridge.Inheritance.multilevelinheritance;

public class pulsar180 extends pulsar {
	public int Speed;
	public int price;
	
	public pulsar180(int speed, int price) {
		super(speed, price);{
			this.Speed = speed;
			this.price = price;
			super.price=100000;
			super.Speed=45;
		}
		   
	}

	@Override
	public String toString() {
		return "pulsar180 [Speed=" + Speed + ", price=" + price + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
