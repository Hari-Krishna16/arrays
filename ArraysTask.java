package de.zeroco.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArraysTask {

	public static void main(String[] args) {
		String firstArray[] = { "A", "B", "C", "D" };
		String[] secondArray = { "A", "B", "C" };
		System.out.println(Arrays.deepToString(getUniqueElementsInArray(firstArray, secondArray)));

		Map<String, Object> firstMap = new LinkedHashMap<String, Object>();
		firstMap.put("first", "Shiva");
		firstMap.put("second", "Hari");
		firstMap.put("third", "Mohan");
		firstMap.put("fourth", "Kiran");

		Map<String, Object> secondMap = new LinkedHashMap<String, Object>();
		secondMap.put("first", "Shiva");
		secondMap.put("second", "Kiran");
		secondMap.put("third", "Niraj");
		secondMap.put("fourth", "Madhan");

		Map<String, Object> thirdMap = new LinkedHashMap<String, Object>();
		thirdMap.put("first", "Shiva");
		thirdMap.put("second", "Krishna");
		thirdMap.put("third", "Niraj");
		thirdMap.put("fourth", "Purna");

		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		list.add(firstMap);
		list.add(secondMap);
		list.add(thirdMap);
		System.out.println(getValuesWithKey(list, "first"));
	}

	public static String[] getUniqueElementsInArray(String[] firstArray, String[] secondArray) {
		return Arrays.stream(firstArray).filter(element -> Arrays.stream(secondArray).noneMatch(str -> str.equals(element)))
				.toArray(String[]::new);
	}

	public static String getValuesWithKey(List<Map<String, Object>> list, String key) {
		return list.stream().filter(map -> map.containsKey(key)).map(map -> map.get(key).toString())
				.collect(Collectors.joining(","));
	}
}
