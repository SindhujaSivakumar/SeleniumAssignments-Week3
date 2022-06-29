package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		List<String> lst= new ArrayList<>();
		String[] str = text.split(" ");
		lst = Arrays.asList(str);
		Set<String> set = new LinkedHashSet<>(lst);
		System.out.println(set);
	}

}
