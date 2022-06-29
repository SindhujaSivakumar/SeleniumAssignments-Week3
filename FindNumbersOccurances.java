package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class FindNumbersOccurances {
	public static void main(String[] args) {
		int[] arr= {2,3,5,6,3,2,1,4,2,1,6,-1};
		int len = arr.length;
		Map<Integer,Integer> map = new TreeMap<>();
		Arrays.sort(arr);
		Set<Integer> set = new LinkedHashSet<>();
		for (int i=0;i<len;i++) {
			set.add(arr[i]);
		}
		List<Integer> lst = new ArrayList<>(set);
		for (int i=0;i<lst.size();i++) {
			int count=0;
			int num = lst.get(i);
			for (int j=0;j<len;j++) {
				if (num==arr[j]) {
					count=count+1;
				}
			}
			map.put(num, count);
		}
		System.out.println(map);
	}

}
