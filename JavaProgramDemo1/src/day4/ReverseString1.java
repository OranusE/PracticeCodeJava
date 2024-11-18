package day4;

public class ReverseString1 {

	public static void main(String[] args) {

		String str = "abc";
		String revStr = reverseString(str);
		if (str.equals(revStr))
		{
			System.out.println("String is palindrome "+str);
		}
		else
		{
			System.out.println(" String is not palindrome ");
		}
	
		System.out.println(revStr);
	}

	static String reverseString(String str)
	{
		
		String rev = "";
		char []strchar = str.toCharArray(); 
		// string is converting to char array
		//strchar = {'h,'e', 'l','l','o',' ','A','l','l'}
		
		for(int i= str.length()-1 ; i>=0 ; i--)
		{
			rev = rev+str.charAt(i);
		}
		return rev;
	}
}
