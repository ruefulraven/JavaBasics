package main;

public class Child extends Parent{
	
	String firstName = "Axel-2";
	String lastName = super.getLastName();
	String middle = super.middleName();
	@Override
	public void hello() {
		System.out.println("Hello from Child!!!");
	}
	
	
}
