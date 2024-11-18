package testoopconcepts;

public class Student2 extends Person {

	int rollNumber;

	Student2(int rollNumber, String name, String address)
	{
		super(name, address);
		this.rollNumber =rollNumber;
		
	}
	void display() {
		super.display();
		System.out.println(" Roll Number = " + rollNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 student1 = new Student2();
		student1.address = " Bang";
		student1.name = " Test";
		student1.rollNumber = 3;
		student1.display();
	}

}
