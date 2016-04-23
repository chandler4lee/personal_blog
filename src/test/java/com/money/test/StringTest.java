package com.money.test;

import org.junit.Test;

public class StringTest {

	@Test
	public void removeLastCharTest() {
		String s = "s,1,";

		s = s.substring(0, s.length());

		System.out.println(s);

		s = s.substring(0, s.length() - 1);

		System.out.println(s);
	}

}
