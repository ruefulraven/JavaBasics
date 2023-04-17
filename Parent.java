package main;

public class Parent {
	
	private String firstName = "Axel";
	private String lastName = "Bajan";
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		//logic - parse yung last name bago ibigay, other calculations
		
		return lastName;
	}
	
	public void setFirstName(String input) {
		//logic - parse yung last name bago ibigay, other calculations
		firstName = input;
	}
	
	public void setLastName(String input) {
		lastName = input;
	}
	
	public void hello() {
		System.out.println("Hello from Parent!!!");
	}
	
	public void hello(String input) {
		System.out.println("Hello from Parent!!!" + input);
	}
	
	public void hello(int input) {
		System.out.println("Hello from Parent!!!" + input);
	}
	
	public void hello(double input) {
		System.out.println("Hello from Parent!!!" + input);
	}
	
	public void hello(boolean input) {
		System.out.println("Hello from Parent!!!" + input);
	}
}
