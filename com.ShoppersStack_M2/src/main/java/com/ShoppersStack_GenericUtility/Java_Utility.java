package com.ShoppersStack_GenericUtility;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class Java_Utility {
	
	public int generateRandomNumber() {
		Random r = new Random();
		int num = r.nextInt(1000);
		return num;
	}
	
	public String getLocalDate() {
		String date = LocalDate.now().toString().replace("-","");
		return date;
	}
	
	public String getLocalDateAndTime() {
		String time = LocalDateTime.now().toString().replace("-","").replace(":","").replace(".","");
		return time;
	}

//	public static void main(String[] args) {
//		
//		System.out.println(FrameworkConstants.screenshotPath);
//		System.out.println(FrameworkConstants.reportsPath);
//
//		Random r = new Random();
//		int num = r.nextInt(1000);
//		System.out.println(num);
//		
//		String date = LocalDate.now().toString().replace("-","");
//		System.out.println(date);
//		
//		String time = LocalDateTime.now().toString().replace("-","").replace(":","").replace(".","");
//		System.out.println(time);
//
//	}

}
