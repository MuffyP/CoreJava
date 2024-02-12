package com.edubridge.interfacedemo;
//program to demonstarte nested interface
interface Books {
	
	void showBooks();
	
	//nested interface
	//inner interface
	interface StoryBooks{
		void showStoryBooks();
	}
	

}
