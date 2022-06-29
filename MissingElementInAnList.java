package week3.day2;

import java.util.List;
import java.util.Arrays;

public class MissingElementInAnList {
	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(1,2,3,4,7,6,8);
		int len = lst.size();
		for (int i=0;i<len;i++) {
			int n = i+1;
			if(n!=lst.get(i)) {
				System.out.println("Number " + n + " is missing" );
				break;
			}
		}
	}

}
