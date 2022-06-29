package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(3,2,11,4,6,7);
		Collections.sort(lst);
		int len = lst.size();
		System.out.println("Second largest Number in the list is: "+lst.get(len-2));
	}

}
