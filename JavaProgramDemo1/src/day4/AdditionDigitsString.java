package day4;

public class AdditionDigitsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "a4w2";
		int sum = 0;
		char ch [] = str.toCharArray();
		for(int i=0; i<str.length(); i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{	
				sum += str.charAt(i);
				
			}
		}
		
		System.out.println(sum);
	}

}
