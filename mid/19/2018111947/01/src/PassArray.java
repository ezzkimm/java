/* 2018111947 ±èµµÈñ */

public class PassArray {
	public static void main(String[] args) {
		int[][] array = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
		
		printArray2D1(array);
		printArray2D2(array);
	}
	
	public static void printArray2D1(int[][] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++)
				System.out.printf("%d ", array[i][j]);
			System.out.println();
		}
	}
	
	public static void printArray2D2(int[][] array) {
		for(int[] i : array) {
			for(int j : i )
				System.out.printf("%d ", j);
			System.out.println();
		}
	}
}
