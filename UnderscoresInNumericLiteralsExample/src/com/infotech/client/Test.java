package com.infotech.client;

public class Test {

	public static void main(String[] args) {
		
		//Valid example
		long creditCardNumber = 1234_5678_9012_3456L;
		long socialSecurityNumber = 999_99_9999L;
		float pi = 	3.14_15F;
		long hexWords = 0xCAFE_BABE;
		byte inByte = 0b0010_0101;
		
		System.out.println("CreditCardNumber:"+creditCardNumber);
		System.out.println("SocialSecurityNumber:"+socialSecurityNumber);
		System.out.println("Pi:"+pi);
		System.out.println("hexWords:"+hexWords);
		System.out.println("inByte:"+inByte);
		
		//You can place underscores only between digits; you cannot place underscores in the following places:
		
		//1.At the beginning or end of a number
		//int x1 = _52;    // This is an identifier, not a numeric literal
		//int x8 = 0x52_; // Invalid; cannot put underscores at the end of a number
		
		//2.Adjacent to a decimal point in a floating point literal
		//float pi1 = 3_.1415F; // Invalid; cannot put underscores adjacent to a decimal point
		//float pi2 = 3._1415F; // Invalid; cannot put underscores adjacent to a decimal point
		
		//3.Prior to an F or L suffix
		//long socialSecurityNumber1= 999_99_9999_L;// Invalid; cannot put underscores prior to an L suffix
		
		//4.In positions where a string of digits is expected
		//long ssN = Long.parseLong("999_99_9999");
		
	}

}
