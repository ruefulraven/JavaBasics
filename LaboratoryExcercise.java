package main;

public class LaboratoryExcercise {

	public static void main(String[] args) {
		//recurring in java - isa sya sa mga advance lesson
		for(int i = 0; i <= 2; i++) {
			switch(i) {
				case 0:
					System.out.println("  *");
					break;
				case 1:
					System.out.println(" ***");
					break;
				case 2:
					System.out.println("*****");
					break;
			}
		}
		
		for(int i = 2; i >= 0; i--) {
			switch(i) {
				case 0:
					System.out.println("  *");
					break;
				case 1:
					System.out.println(" ***");
					break;
				case 2:
					System.out.println("*****");
					break;
			}
		}
		
		for(int i = 1; i <= 5;i++) {
			switch(i) {
				case 1:
					System.out.println("1");
					break;
				case 2:
					System.out.println("12");
					break;
				case 3:
					System.out.println("123");
					break;
				case 4:
					System.out.println("1234");
					break;
				case 5:
					System.out.println("12345");
					break;
			}
		}
		System.out.println("Axel Bajan \n IM-2nd-sampaguita");
		/*
		 * A = 2
			B= 4
			Letter = ‘c’
			Pi = 3.14
			The value of A is 2 while B is 4
			Letter c
			Initial value of Sagot is true
			Pi contains the value 3.14
			Sagot is now false
		 * */
		boolean sagot = true;
		int a = 2;
		int b = 4;
		char letter = 'c';
		double pi = 3.14;
		System.out.println("The value of A is " + a + " while B is " + b);
		System.out.println("Letter " + letter);
		System.out.println("Initial value of Sagot is " + sagot);
		System.out.println("Pi contains the value of " + pi);
		System.out.println("Sagot is now " + !sagot);
		//Method - block of code lang sya na magrurun whenever we call it
	}

}
