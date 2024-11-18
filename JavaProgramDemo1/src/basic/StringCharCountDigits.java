package basic;

public class StringCharCountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="Th5is is23 56java03 Pro86gra14m";
		int countDigits =0, count =0;
		
		for(int i = 0; i< str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				if(Character.isDigit(str.charAt(i)))
				{
					countDigits++;
				}
				else
				{
					count++;
				}
			}	
		}
		
		System.out.println("Digit Count  = "+countDigits);
		System.out.println("Count of Char = "+count);
	}

}
