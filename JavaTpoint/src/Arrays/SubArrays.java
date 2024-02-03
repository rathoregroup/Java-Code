package Arrays;

public class SubArrays {
//subArrays
// Continuous part of an array;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4};
		subArrays(arr);
	}
	public static void subArrays(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				for (int k = i; k < j + 1; k++) {
					System.out.print(a[k] + " ");
				}
				System.out.println();
			}
		}
	}
}
