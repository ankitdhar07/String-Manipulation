package com.javaTest.area;

public class SubstringSolution {

	public static void main(String[] args) {
		String str = "saiankitsaiankitsaian";
		String temp = str;
		StringBuilder sb=new StringBuilder(str);
		String maxLength = "";
		for (int i = 1; i < str.length() / 3; i++) {
			temp = str.substring(0, i);
			// System.out.println(temp);
			for (int j = str.length() - str.length() / 3; j < str.length(); j++) {
				int res = str.lastIndexOf(temp);
				if (res > maxLength.length()) {
					maxLength = temp;
					System.out.println("Big String: "+maxLength);
				}
			}
		}
		String middle = str.substring(str.length() / 3, str.length() - str.length() / 3);
		System.out.println("MaxLength to be searched :"+maxLength);
		System.out.println(middle);
		System.out.println(middle.contains(maxLength) ? "Yes" : "No");

		StringBuffer tempSB = new StringBuffer(str);
		String first = str.substring(0, str.length() / 3);
		tempSB.delete(0, first.length());
		String second = tempSB.substring(0, temp.length() / 2);
		String third = tempSB.delete(0, second.length()).toString();
		System.out.println(str);
		System.out.println("First Part : "+first);
		System.out.println(second);
		System.out.println(third);

		StringBuffer revThird = new StringBuffer(third);
		System.out.println("Reverse: " + revThird.reverse());
		if (first.equals(second) && second.equals(third)) {
			System.out.println("unique String Found");
		}

	}
}
