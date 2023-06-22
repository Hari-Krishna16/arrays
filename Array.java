package de.zeroco.arrays;

import java.util.Arrays;

import de.zeroco.utility.Utility;

public class Array {

	public static void main(String[] args) {
//		int[] numbers = {1,2,3,4,5,6};
//		int [][] multiValues= {{1,2,3,4,5},{6,7,8,9}};
//		for(int i =0;i<multiValues.length;i++) {
//			for(int k=0;k<multiValues[i].length;k++) {
//				System.out.println(multiValues[i][k]);
//			}
//		}

//		int numbers[] = { 1,4,3, 5, 7, 8, 9,2,6};
//		String values[] = { "Hari", "Shiva", "Mohan", "Geetha", "Navya", "Ravi" };
//		System.out.println(isValueInArray(values, "Ramesh"));
//		System.out.println(getRangeValues(numbers, 2, 5));
//		System.out.println(getFillRange(numbers, 3, 4, 10));
//		System.out.println(getSortedValues(values));
//		System.out.println(getUpdatedValues(values, 1, "shivayya"));
//		System.out.println(getValueInArray(values,0));
	}

	public static boolean isValueInArray(String values[], String search) {
		if ((Utility.isBlank(values) || (Utility.isBlank(search)))) {
			return false;
		}
		for (String value : values) {
			if (value.equals(search)) {
				return true;
			}
		}
		return false;
	}

	public static String getCopyOfRangeValues(int numbers[], int startIndex, int endIndex) {
		if ((Utility.isBlank(startIndex) || (Utility.isBlank(endIndex)))) {
			return null;
		}
		return Arrays.toString(Arrays.copyOfRange(numbers, startIndex, endIndex));
	}

	public static String getFillRange(int[] numbers, int startIndex, int endIndex, int key) {
		if ((Utility.isBlank(startIndex) || (Utility.isBlank(endIndex)))) {
			return null;
		}
		Arrays.fill(numbers, startIndex, endIndex, key);
		return Arrays.toString(numbers);
	}

	public static String getSortedValues(String values[]) {
		if ((Utility.isBlank(values))) {
			return null;
		}
		Arrays.parallelSort(values);
		return Arrays.toString(values);
	}

	public static String getUpdateValues(String values[], int index, String value) {
		if ((Utility.isBlank(values)) || (Utility.isBlank(index)) || (Utility.isBlank(value))) {
			return null;
		}
		values[index] = value;
		return Arrays.toString(values);
	}

	public static String getValuefromArray(String[] values, int index) {
		if ((Utility.isBlank(values))) {
			return null;
		}
		return values[index];
	}

}
