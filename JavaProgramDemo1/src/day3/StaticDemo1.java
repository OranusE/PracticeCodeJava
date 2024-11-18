package day3;

import testoopconcepts.Person;

public class StaticDemo1 {
	
	static int a =10;
	static int b ;
	
	static int m1()
	{
		System.out.println(" this is m1 method....");
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" a = "+a);
		m1();
		System.out.println(" This is method main method");
		m1();
		m1();
		Person p1 = new Person();
		
	}

	static {
		System.out.println(" Static block is initialized.... ");
	}
	
}
