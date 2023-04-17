package main;
import java.util.Scanner;
public class Inputs {

	public static void main(String[] args) {
		//class  type, variable name = variable value
		System.out.println("Axel Bajan \n IM-2nd-sampaguita");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scanner.nextLine();
		
		System.out.println("Enter your subject/course");
		String subject = scanner.nextLine();
		
		System.out.println("Enter your year");
		String year = scanner.nextLine();
		
		System.out.println("Enter your section");
		String section = scanner.nextLine();
		
		System.out.println(name + " \n" + subject + "-" + year + "-" + section);
		scanner.close();
		
	}

}
