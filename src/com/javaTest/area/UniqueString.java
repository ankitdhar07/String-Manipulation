package com.javaTest.area;

import java.util.Scanner;

public class UniqueString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// String s = sc.nextLine();
		String s = "saiankitsaiankitsaian";
		int n = s.length();
		System.out.println(n);

		try {
			if (n < 2) {
				throw new Exception("Single Letter String");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		int len = 0;
		int i = n / 2;

		while (i < n) {
			if (s.charAt(i) == s.charAt(len)) {
				System.out.print("Match Char " + s.charAt(i) + "  " + s.charAt(len) + " ");
				System.out.println(i + " " + len);
				++len;
				++i;
			} else {
				if (len == 0) { // no prefix
					++i;
					System.out.println("Moving to Right " + i + " " + len);
				} else {
					// if breaks in between smaller prefix
					--len;
					System.out.println("Reducing Length: " + len);
				}
			}
		}
		String uniqueVal = s.substring(0, len);
		StringBuffer sb = new StringBuffer(s);
		String temp = sb.substring(len, s.length() - len);
		if (temp.contains(uniqueVal)) {
			System.out.println("UniQue String: " + uniqueVal);
		} else
			System.out.println("No Unique String");
	}
}
