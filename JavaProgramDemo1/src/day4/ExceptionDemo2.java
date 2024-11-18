package day4;

import java.sql.SQLException;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {10,20,40};
		try {
		System.out.println(a[100]);
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println(e);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		
		for(int i =0;i<a.length ; i++)
		{
			System.out.println(a[i]);
		}
	}

}
