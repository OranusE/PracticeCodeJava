package testoopconcepts;

public class Student {

	int rollNumber;
	String name;
	String address; 
	static String schoolName ="sts School";
	
	Student()
	{
		rollNumber =10;
		name =" test";
		address = "pune";
	}
	static void schoolData()
	{
		schoolName = "Abc School";
	}
	Student(int rollNumber, String name, String address)
	{
		this.rollNumber =rollNumber;
		this.name =name;
		this.address = address;
	}
	
	
	
	void display()
	{
		System.out.println(" Roll Numer = "+rollNumber);
		System.out.println(" Name = "+name);
		System.out.println(" Address = "+address);
		System.out.println(" School Name = "+schoolName);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		s1.rollNumber =1;
		s1.name = "Chandan";
		s1.address = "Usa";
		s1.display();
		
		Student s2 = new Student();
		s2.rollNumber =2;
		s2.name = "Shalet";
		s2.address = "Canada";
		s2.display();
		
		Student.schoolName = "abc";
		schoolData();
		s2.display();
		
	}

}
