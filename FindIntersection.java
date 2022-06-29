package week3.day2;

import java.util.Arrays;
import java.util.List;

public class FindIntersection {
	public static void main(String[] args) {
		List<Integer> lst1 = Arrays.asList(3,2,11,4,6,7);
		List<Integer> lst2 = Arrays.asList(1,2,8,4,9,7);
		for (int i=0; i<lst1.size();i++) {
			for (int j=0;j<lst2.size();j++) {
				if (lst1.get(i).equals(lst2.get(j))) {
					System.out.println(lst1.get(i));
				}
			}
		}
	}

}
