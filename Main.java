package main;

public class Main {

	public static void main(String[] args) {
		System.out.println(12 + "\n" + 12);
		//String, int, double, boolean, array, char
		//data type, variable name, = , variable value
		String sampleString = "hello";
		int sampleInt = 3;
		double sampleDouble = 1.12;
		boolean sampleBoolean = true;
		boolean isNight = true;
		char sampleChar = 'A';
		String[] sampleArray = {"Hello", "World"};
		//=======================1=========2
		int asdasd = 1+2;
		//if statements
		//if, else if, else
		
		if(sampleInt == 1) {
			System.out.println("it is 1");
		}else if(sampleInt == 2) {
			System.out.println("it is 2");
		}else {
			System.out.println("it is 3");
		}
		
		//short hand if else
		String timeOfTheDay = (isNight == false) ? "Goodmorning" : "Goodevening";
		System.out.println(timeOfTheDay);
		
		//statement 1 = dito naglalagay ng variable to start the loop
			// int i = 0
		//statement 2 = dito naglalagay ng condition for our loop to run.
			// i <= 10
		//statement 3 = dito inincrease/decrease yung value per loop that is executed.
			//i++
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
		for(int i = 0; i <= sampleArray.length - 1; i++) {
			System.out.println(sampleArray[i]);
		}
		
		//for each loop
		for(String var : sampleArray) {
			System.out.println(var);
		}
		
		switch(sampleInt) {
			case 1:
				System.out.println("Switch: it is 1");
				break;
			case 2:
				System.out.println("Switch: it is 2");
				break;
			default:
				System.out.println("Switch: it is 3");
		}
	}

}
