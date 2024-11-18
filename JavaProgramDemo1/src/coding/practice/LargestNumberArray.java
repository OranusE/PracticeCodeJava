package coding.practice;

public class LargestNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks[] = {21,53,23,33,24,43,95};
		
		int max =marks[0];
		for(int i=1 ; i<marks.length;i++)
		{
			if(marks[i]>max)
			{
				max= marks[i];
				
			}
			
		}
		System.out.println(max);
	}

}
