package basic;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marksEng =10;
		int marksMath = 20;
		
		int sum = marksEng+marksMath ;
		double avg = sum/2;
	
		int c =100, d =20;
		int e = c-d;
		int h = c*d;
		 c = ++c;
		
		
		System.out.println("c = "+c);
		System.out.println("H = "+h);
		if(c==d)
		{
			System.out.println("C is  equal to D");
		}
		
		else
		{
			System.out.println(" C is not equal to D - else block executed");
		}	
		
	}	

}
