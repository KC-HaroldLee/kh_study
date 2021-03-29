package day20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class summary_04 {
	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("철수");
		names.add("영희");
		names.add("영수");
		names.add("민지");
		names.add("미영");
		names.add("민수");
		
		Collections.shuffle(names);
		
		List<String>win = names.subList(0, 2);
		System.out.println(win);
		
		}
}
