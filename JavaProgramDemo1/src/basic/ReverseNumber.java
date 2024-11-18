package basic;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =123986, rev =0;
		// rev= 321 - 
		/*num%10 - 3
		rev =3;
		num/10 = 12 %10 - 2
		rev*10 = 30+2 = 32*10 +1
		num/10 12/10 - 1
		

*/
		while(num!=0)
		{
			int reminder = num%10;
			rev = rev*10+reminder;
			num =num/10;
			
		}
		System.out.println("Reverse Number = "+rev );
	}

}
