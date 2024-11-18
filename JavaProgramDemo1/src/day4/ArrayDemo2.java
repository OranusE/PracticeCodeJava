package day4;

public class ArrayDemo2 {

	public static void main(String[] args) {
		
		// WAP tp copy all elements from one array to another
		
		int a[] = {2,5,3};  // 
		
		int b[] = new int[3];  // 
		
//		b=a;  // location address
//		
//		System.out.println(b);
//		
		for(int i = 0;i<a.length ; i++)  {
				b[i] = a[i];
		}
		System.out.println("array a ");
		for(int i = 0;i<a.length ; i++)  {
			System.out.println(a[i]);
		}
		
		System.out.println("array b  ");
		for(int i = 0;i<a.length ; i++)  {
			System.out.println(b[i]);
		}
		
		
	}

}
