package com.demo.Jenkins_demo;

public class PrimeNumber {

	public String primeNumberCheck(int num) {
		int temp=num/2;
		boolean val=true;
		String stament;
		for(int i=2;i<=temp;i++) {
			if(num%i==0) {
			//	System.out.println("Number Is not Prime");
				val=false;
				break;
			}
			else{
			//	System.out.println("Number is prime");
			}
		}
		if(val==true) {
			stament="Number is prime";
		}
		else{
			stament="Number is not prime";
		}
		return stament;
		
	}

	/*public static void main(String args[]) {
		PrimeNumber pb=new PrimeNumber();
		String test=pb.primeNumberCheck(8);

		System.out.println(test);
	}*/
	
	
}
