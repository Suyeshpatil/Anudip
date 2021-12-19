package assignment12dec17;

public class TwoDemArray {
	public static void main(String[] args) {
		int[][] a = { { 3, 2 }, { 1, 4 }, { 7, 6 } };

		System.out.println("2D Array is: ");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(a[i][j]);
			}
		}
	}
}
//Output
//2D Array is: 
//3
//2
//1
//4
//7
//6