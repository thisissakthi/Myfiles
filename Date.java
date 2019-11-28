package hello;

import java.util.Calendar;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int date=07;
		//int month=11;
		//int year=1999;
		Calendar cal=Calendar.getInstance();
		//cal.clear();
		System.out.println();
		//cal.set(Calendar.YEAR,year);
		//cal.set(Calendar.MONTH,month);
		//cal.set(Calendar.DATE,date);
		System.out.println(cal.getTime());
		System.out.println();

	}

}

