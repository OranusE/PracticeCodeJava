package day3;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b1 = new Bank();
		b1.setBalance(100);
		System.out.println(b1.getBalance());
		b1.name = "Test User 1";
		System.out.println(b1.name);
		
		Teacher t1 = new Teacher();
		t1.setName("Gajal");
		System.out.println(t1.getName());
	}

}
