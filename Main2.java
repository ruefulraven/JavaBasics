package main;

public class Main2 {

	public static void main(String[] args) {
		
		Parent parent = new Parent();
		Child child = new Child();
		parent.setLastName("Bajan-Updated");
		
		System.out.println(parent.getFirstName() + parent.getLastName());
		System.out.println(child.firstName + child.lastName + child.middle);
		
		parent.hello();
		child.hello();
 
		parent.hello();
		parent.hello(1.2);
		parent.hello("ASDASDAD");
		parent.hello(12);
		parent.hello(true);
		
		Class1 class1 = new Class1();
		class1.abstractCall();
		
		Class2 class2 = new Class2();
		class2.abstractCall();
	}

}
