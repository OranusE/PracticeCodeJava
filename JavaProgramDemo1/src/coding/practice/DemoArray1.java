package coding.practice;

public class DemoArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum =0;
		
		int marks[] = {21,53,23,33,24,43};
		//5<6 - t
		//6<6 - f
		for(int i = 0;i<marks.length;i++)
		{
			sum = sum+marks[i];
			System.out.println("Sum = "+sum);
			System.out.println("m = "+marks[i]);
		}
		System.out.println(" total marks = "+sum);
		
	}

}
