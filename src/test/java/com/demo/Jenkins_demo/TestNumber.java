package com.demo.Jenkins_demo;

import org.junit.BeforeClass;
import org.junit.Test;

@SuppressWarnings("restriction")
public class TestNumber {
PrimeNumber pN;

	@BeforeClass
	    public void setUp() {
		    pN = new PrimeNumber();
	    }
	
	@Test
	public void testFirstOne(){
		String outResult=pN.primeNumberCheck(13);
		System.out.println("OutResult :"+outResult);
	}
}
