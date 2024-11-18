package testoopconcepts;

public class Calculator2 {

	static int add(int a, int b)
	{
		int sum = a+b;
		return sum;
	}
	static int mul(int a, int b)
	{
		int m = a*b;
		return m;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s = add(10, 20);
		int ans = mul(s,3);
		System.out.println(ans);
	}
}
