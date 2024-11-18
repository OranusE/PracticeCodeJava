package testoopconcepts;

public class Person {
	
	String name;   // instance variable
	String address; 
	
	public Person()   // default constructor
	{
		name = "Test";
		address = "bang";
	}
	Person(String name, String address)   // Para constructor
	{
		this.name = name;   
		this.address = address;
	}
	
	void display()
	{
		System.out.println(" Name = "+name);
		System.out.println(" Addess = "+address);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person();  // auto constructor will be executed
//		person1.name = " Rama";
//		person1.address = " Pune";
		
		person1.display();  // call a method
		
		Person person2 = new Person("Shalet", "Usa");
		person2.display();
	}

}
