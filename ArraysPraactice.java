package de.zeroco.arrays;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import de.zeroco.utility.Utility;

public class ArraysPraactice {

	public static void main(String[] args) {
		int[] input = { 1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6 };
//		System.out.println( Arrays.toString(removeDuplicatesInArray(input)));
//		System.out.println(getDurationBetweenDateTime("2023-06-22T10:30", "2023-06-22T10:50"));
//		System.out.println(subtractDurationFromTime("22-06-2023 11:00:30", "23-06-2023 11:00:45"));
		
		LocalDateTime d= LocalDateTime.now();
		System.out.println(d);
	}

	public static int[] removeDuplicatesInArray(int[] array) {
		Arrays.sort(array);
		int[] uniqueArray = new int[array.length];
		uniqueArray[0] = array[0];
		int count = 1;
		for (int i = 1; i < array.length; i++) {
			if (array[i] != array[i - 1]) {
				uniqueArray[count++] = array[i];
			}
		}
		return Arrays.copyOf(uniqueArray, count);
	}

	public static long getMinutesBetweenDateTime(String firstDateTime, String secondDateTime) {
		if (Utility.isBlank(firstDateTime) || (Utility.isBlank(secondDateTime))) {
			return 0;
		}
		return  Duration.between(LocalDateTime.parse(firstDateTime), LocalDateTime.parse(secondDateTime)).toMinutes();
	}

	public static LocalDateTime subtractDurationFromDateTime(String firstDateTime, String secondDateTime) {
		if (Utility.isBlank(firstDateTime) || (Utility.isBlank(secondDateTime))) {
			return null;
		}
		DateTimeFormatter formatt=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		LocalDateTime first = LocalDateTime.parse(firstDateTime,formatt );
		Duration duration = Duration.between(first, LocalDateTime.parse(secondDateTime,formatt));
		return first.minusDays(duration.toDays()).minusHours(duration.toHours() % 24).minusMinutes(duration.toMinutes() % 60).minusSeconds(duration.toMillis() / 1000);
	}
}
