package array;

public class ReturnArray {

	public static void main(String[] args) {
		int m[]=display();
		for(int i:m)
			System.out.println(i);		
	}

	public static int[] display() {
		
		int arr[]= {12,34,54,34,4};
		return arr;
	}
}
