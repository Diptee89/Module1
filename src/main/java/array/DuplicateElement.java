package array;

import java.util.Arrays;

public class DuplicateElement {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 23, 3, 4, 2, 8, 8, 3 };

		Arrays.sort(arr);
		for (int m : arr) {
			System.out.print(m+ " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Found Duplicate Number" + arr[j]);
				}
			}

		}
	}

}
