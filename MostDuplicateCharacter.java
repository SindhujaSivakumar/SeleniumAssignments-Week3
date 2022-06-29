package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MostDuplicateCharacter {
	public static void main(String[] args) {
		Map<Character,Integer> map = new HashMap<>();
		String str = "abbabab";
		char[] ch = str.toCharArray();
		int len = ch.length;
		Set<Character> set = new LinkedHashSet<>();
		for (int i=0;i<len;i++) {
			set.add(ch[i]);
		}
		System.out.println(set);
		List<Character> lst = new ArrayList<>(set);
		for (int i=0;i<lst.size();i++) {
			int count=0;
			char ch1 = lst.get(i);
			for (int j=0;j<len;j++) {
				if (ch1==ch[j]) {
					count=count+1;
				}
			}
			map.put(ch1, count);

		}
		int maxValueInMap=(Collections.max(map.values()));
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey());     // Print the key with max value
            }
		}
	}
}


