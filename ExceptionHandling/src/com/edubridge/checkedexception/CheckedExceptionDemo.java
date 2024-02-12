package com.edubridge.checkedexception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

//program to demonstarte on checcked exception file not found compile error
public class CheckedExceptionDemo {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\lenovo\\Downloads\\Core JavaInterviewQuestion (95).txt");
		try {
			FileInputStream f1 = new FileInputStream(f);
			System.out.println("File does exist");
		} catch(FileNotFoundException e){
			System.out.println("File does not Exist "+e);
		}
	}
	

}
