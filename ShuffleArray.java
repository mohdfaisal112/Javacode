package ty;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
	public static void shufflearray(int[] arr) {
		Random rnum = new Random();

		for (int i=0; i<arr.length; i++) {
			int randomPos= rnum.nextInt(arr.length);
			int temp = arr[i];
			arr[i] = arr[randomPos];
			arr[randomPos] = temp;
		}

		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int [] a= {1,2,3,4,5};
		System.out.println(Arrays.toString(a));
		shufflearray(a);
	}
}

