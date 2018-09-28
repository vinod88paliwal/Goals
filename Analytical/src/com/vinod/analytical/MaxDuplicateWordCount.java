package com.vinod.analytical;

import java.util.*;

public class MaxDuplicateWordCount {
	public static void main(String[] args) {

		String str = "Hello mohANlal where are you working where YoU Mohanlal you ";

		Map<String, Integer> dupMap = new HashMap<String, Integer>();

		String[] strArr = str.split(" ");

		for (String tmp : strArr) {


			if (dupMap.containsKey(tmp)) {
				dupMap.put(tmp, dupMap.get(tmp) + 1);
			} else {
				dupMap.put(tmp, 1);
			}
		}

		Set<String> keys = dupMap.keySet();
		
		for (String ch : keys) {
			if (dupMap.get(ch) > 1) {
				System.out.println(ch + "--->" + dupMap.get(ch));
			}
		}

	}

}
