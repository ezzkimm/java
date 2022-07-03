/* 2018111947 ±èµµÈñ */

import java.util.Scanner;
import java.util.Arrays;
import java.security.SecureRandom;

public class PassArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("3Â÷¿ø ¹è¿­ÀÇ sections, rows, cols : ");
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
		
		for(int i = 0; i < array.length; i++)
			for(int j = 0; j < array[i].length; j++)
				for(int k = 0; k < array[i][j].length; k++)
					array[i][j][k] = 1 + random.nextInt(10);
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
