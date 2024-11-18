package day3;

public class Cat implements Animal, Dog{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(" Run method");
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
		System.out.println(" eat method");
	}
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println(" Sleep method");	
	}
	public static void main(String[] args) {
		
		Cat c1 = new Cat();
		c1.run();
		c1.sleep();
		c1.eat();
	}
}
