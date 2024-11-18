package basic;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		String str = "madam";
	
		String newStr ="";
		for(int i=str.length()-1;i>=0;i--)
		{
			newStr =newStr+ str.charAt(i);
		}
		System.out.println(newStr);
		
		if(str.equals(newStr))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println(" This is not palindrome");
		}
	}

}
