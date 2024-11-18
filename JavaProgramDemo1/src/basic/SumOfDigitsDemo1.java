package basic;

public class SumOfDigitsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "4a43nanc";
		int sum =0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				sum = sum+Character.getNumericValue(str.charAt(i));
				
			}
		}
		System.out.println(" Sum of all Digits = "+sum);
	}

}
