package com.chap05_date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class run {
	public static void main(String[] args) {
		Date time = new Date();
		System.out.println(time);

		Date time2 = new Date(0L);
		System.out.println(time2);

		String time3 = new Date(1000L).toGMTString(); // 기준으로부터 1초 지난 날짜
		System.out.println(time3);

		Date today = new Date();
		System.out.println(today);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd"); // 내가 원하는 포맷으로 변경
		System.out.println(sdf.format(today)); // 해당하는 날짜로 출력
		System.out.println();

		System.out.println("---캘린더---");
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		calendar.set(2020, 8 - 1, 12); // calendar 은 month 가 1월 앞으로 저장 그래서 -1

		int year = calendar.get(1);
		int month = calendar.get(Calendar.MONTH) + 1;
		int date = calendar.get(Calendar.DATE);
		int hour = calendar.get(Calendar.HOUR);
		int min = calendar.get(Calendar.MINUTE);
		System.out.println(year + "-" + month + "-" + date + "-" + hour + ":" + min);

		System.out.println();

		System.out.println("---그레고리안---");
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.getTime());
		
		System.out.println("year: " + gc.get(Calendar.YEAR));
		System.out.println("month: " + gc.get(Calendar.MONTH)+1);
		
		gc.set(2017,  10-1, 22);
		System.out.println(gc.getTime());
	}

}
