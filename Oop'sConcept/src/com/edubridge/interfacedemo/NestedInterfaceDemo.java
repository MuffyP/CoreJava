package com.edubridge.interfacedemo;

public class NestedInterfaceDemo implements Books, Books.StoryBooks{
	
	public static void main(String[] args) {
		NestedInterfaceDemo n = new NestedInterfaceDemo();
		n.showBooks();
		n.showStoryBooks();
	}
	
	@Override
	public void showStoryBooks() {
		System.out.println("Half-Girlfriend");
	}

	@Override
	public void showBooks() {
		System.out.println("Java Programming-"+"By Mufaddal plasticwala");
	}

}
