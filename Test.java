/**
 * 
 */
package com.alti.basic;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rkrishnamoorthy4257
 *
 */
public class Test {

	public static void main(String[] args) {
		String input = "hello world Raaaa";

		String[] splt = input.split(" ");

		int i = 1;

		for (String data : splt) {
			Map<String, Integer> mapData = new HashMap<String, Integer>();

			for (char chrs : data.toCharArray()) {
				if (mapData.isEmpty()) {
					mapData.put(chrs + "", i);
				} else {
					if (mapData.containsKey(chrs + "")) {
						mapData.put(chrs + "", mapData.get(chrs + "") + 1);
					} else {
						mapData.put(chrs + "", i);
					}
				}
			}
			System.out.println(data + "" + mapData);
		}

	}
}
