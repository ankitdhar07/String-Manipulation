package com.javaTest.area;

import java.util.*;

class Solution {
	public static void main(String[] args) {
		String str = "saiankitsaiankitsaian";
		String temp = str;
		StringBuffer tempSB = new StringBuffer(str);
		String first = str.substring(0, str.length() / 3);
		tempSB.delete(0, first.length());
		String second = tempSB.substring(0, temp.length() / 2);
		String third = tempSB.delete(0, second.length()).toString();
		System.out.println(third);
		String maxLength = "";
		for (int i = 1; i < str.length() / 3; i++) {
			temp = str.substring(0, i);
			System.out.println(temp);
			for (int j = 1; j < str.length(); j++) {
				int res = third.lastIndexOf(temp);
				if (res > maxLength.length()) {
					maxLength = temp;
				}
			}
			
		}

		String middle = str.substring(str.length() / 3, str.length() - str.length() / 3);
		System.out.println("Max: "+maxLength);
		System.out.println(middle);
		System.out.println(middle.contains(maxLength) ? "Yes" : "No");

	}
}