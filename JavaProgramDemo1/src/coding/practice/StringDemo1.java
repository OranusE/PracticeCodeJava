package coding.practice;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String []cars = {"BMW", "Tata", "Volvo"};
		for(int i =0 ;i< cars.length; i++)
		{
			System.out.println(cars[i]);
		}
		
		// for each  loop
		for(String i : cars)
		{
			System.out.println(i);
		}
		
	}

}
