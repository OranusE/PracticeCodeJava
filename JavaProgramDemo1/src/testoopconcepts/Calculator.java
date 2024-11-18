package testoopconcepts;

class Calculator {
	private void add()
	{
		int a =10,b=30;
		int c = a+b;
		System.out.println(c);
	}
	 void add(double a, double b)
		{		
			double c = a+b;
			System.out.println(c);
		}
	 void add(int a, int b)
	{
		int c = a+b;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		c1.add();
		c1.add(20.33,40.43);
		c1.add(100,200);
		
	}

}
