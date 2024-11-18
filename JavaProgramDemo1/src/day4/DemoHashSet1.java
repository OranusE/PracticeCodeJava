package day4;

import java.util.HashSet;

public class DemoHashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set = new HashSet<String>();
		
		set.add("zyx");
		set.add("Abc");
		set.add("bca");
		set.add("xyz");
		set.add("zyx");
		set.add("xyz");
		set.add("zyx");
		System.out.println(set);  
	}

}
