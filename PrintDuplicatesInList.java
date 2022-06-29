package week3.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInList {
	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(14,12,13,11,15,14,18,16,17,19,18,17,20);
		Set<Integer> set = new LinkedHashSet<>();
		boolean flag = true;
		for (int i=0;i<lst.size();i++) {
			flag = set.add(lst.get(i));
			if (!flag) {
				System.out.println(lst.get(i));
			}
		}
	}

}
