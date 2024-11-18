package basic;

public class StringCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="This is, Java, Program!!";
		int count =0;
		
		for(int i = 0; i< str.length();i++)
		{
			if(str.charAt(i)!=' ' && str.charAt(i)!=','&&str.charAt(i)!='!')
			{
				count++;
			}
			
		}
		
		System.out.println(count);
	}

}
