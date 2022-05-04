package array;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5 };
		for (int i : arr) {
			System.out.print(i + " ");

		}
		System.out.println();
		System.out.println("Array in reverse order: ");
		for (int j = arr.length - 1; j >= 0; j--) {
			System.out.print(arr[j] + " ");
		}
	}

}
