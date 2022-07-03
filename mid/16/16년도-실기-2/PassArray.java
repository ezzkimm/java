/* 2018111947 김도희 */
/* 본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다. */

import java.util.Scanner;
import java.util.Arrays;
import java.security.SecureRandom;

public class PassArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("3차원 배열의 sections, rows, cols : ");
		int sections = input.nextInt();
		int rows = input.nextInt();
		int cols = input.nextInt();
		input.close();
		
		int[][][] array = new int[sections][rows][cols];
		
		inputArray3D(array);
		System.out.println("after creating random numbers");
		printArray3D(array);
		arraysort(array);
		System.out.println("after sorting");
		printArray3D(array);
	}
	
	public static void inputArray3D(int[][][] array) {
		SecureRandom random = new SecureRandom();
		int number;
		
		for(int i = 0; i < array.length; i++)
			for(int j = 0; j < array[i].length; j++)
				for(int k = 0; k < array[i][j].length; k++) {
					number = 1 + random.nextInt(10);
					array[i][j][k] = number;
				}
	}
	
	public static void printArray3D(int[][][] array) {
		for(int[][] i : array) {
			for(int[] j : i) {
				for(int k : j)
					System.out.printf("%3d", k);
				System.out.println();
			}
			System.out.println();
		}
	}
	
	public static void arraysort(int[][][] array) {
		for(int i = 0; i < array.length; i++)
			for(int j = 0; j < array[i].length; j++)
				Arrays.sort(array[i][j]);
	}
}