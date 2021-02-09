package com.cjc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDifferentExample {

//	public static void main(String[] args) {
//		String dateStart = "01/1/2021 09:29:58";
//		String dateStop = "27/2/2021 10:31:48";
//
//		//HH converts hour in 24 hours format (0-23), day calculation
//		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
//
//		Date d1 = null;
//		Date d2 = null;
//
//		try {
//			d1 = format.parse(dateStart);
//			d2 = format.parse(dateStop);
//
//			//in milliseconds
//			long diff = d2.getTime() - d1.getTime();
//
//			long diffSeconds = diff / 1000 % 60;
//			long diffMinutes = diff / (60 * 1000) % 60;
//			long diffHours = diff / (60 * 60 * 1000) % 24;
//			long diffDays = diff / (24 * 60 * 60 * 1000);
//
//			System.out.print(diffDays + " days, ");
//			System.out.print(diffHours + " hours, ");
//			System.out.print(diffMinutes + " minutes, ");
//			System.out.print(diffSeconds + " seconds.");
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	
	public static void main(String args[]){
		 SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
		 String dateBeforeString = "01 01 2021";
		 String dateAfterString = "09 02 2021";

		 try {
		       Date dateBefore = myFormat.parse(dateBeforeString);
		       Date dateAfter = myFormat.parse(dateAfterString);
		       long difference = dateAfter.getTime() - dateBefore.getTime();
		       float daysBetween = (difference / (1000*60*60*24));
	               /* You can also convert the milliseconds to days using this method
	                * float daysBetween = 
	                *         TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS)
	                */
		       System.out.println("123 batch");
		       System.out.println("Number of Days between dates: "+daysBetween);
		 } catch (Exception e) {
		       e.printStackTrace();
		 }
	   }

	}


