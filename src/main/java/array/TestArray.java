package array;

public class TestArray {

	public static void main(String[] args) {
		int []arr=new int[5]; //declaration and instantiation  
		
		arr[0]=3; // initialization
		arr[1]=5;
		arr[2]=7;
		arr[3]=1;
		arr[4]=87;
		
//		for(int i=0; i<=arr.length; i++) //ArrayIndexOutOfBoundsException
		//if length of the array in negative, equal to the array size or greater than the array size while traversing the array
		for(int i=0; i<arr.length; i++)
		System.out.println(arr[i]);
		
	}

}
