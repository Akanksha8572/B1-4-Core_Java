package com.tns.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example7 {

	public static void main(String[] args) {
		String dateString = "2022-04-30 11:22";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime parsedDateTime = LocalDateTime.parse(dateString, formatter);
		System.out.println(parsedDateTime);

	}

}
