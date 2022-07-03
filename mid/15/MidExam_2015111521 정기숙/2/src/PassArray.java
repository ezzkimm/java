import java.util.Arrays;
import java.util.Scanner;
import java.security.SecureRandom;
//2015111521 강가현
//본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

public class PassArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("3차원 배열의 sections, row, cols : ");
		int sections = input.nextInt();
		int rows = input.nextInt();
		int cols = input.nextInt();

		int[][][] array = new int[sections][rows][cols];

		inputArray3D(array);
		System.out.println("after creating random numbers");
		printArray3D(array);
		arraysort(array);
		System.out.println("after sorting");
		printArray3D(array);

	}

	private static void arraysort(int[][][] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				Arrays.sort(array[i][j]);
			}
		}

	}

	private static void printArray3D(int[][][] array) {

		for (int[][] i : array) {
			for (int[] j : i) {
				for (int k : j) {
					System.out.print(k);
					System.out.printf("  ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

	private static void inputArray3D(int[][][] array) {

		SecureRandom randomNum = new SecureRandom();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				for (int k = 0; k < array[i][j].length; k++) {
					array[i][j][k] = 1 + randomNum.nextInt(10);
				}
			}
		}
	}

}
