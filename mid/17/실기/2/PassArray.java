import java.util.Scanner;
import java.util.Arrays;
import java.security.SecureRandom;

public class PassArray 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("3차원 배열의 sections, rows, cols : ");
		int sections = input.nextInt();
		int rows = input.nextInt();
		int cols = input.nextInt();
		
		int [][][]array = new int[sections][rows][cols];
		
		inputArray3D(array);
		System.out.println("after creating random numbers");
		printArray3D(array);
		arraysort(array);
		System.out.println("after sorting");
		printArray3D(array);
	}
	static void inputArray3D(int [][][]array)
	{
		SecureRandom randomNum = new SecureRandom();

		for(int i = 0;i<array.length;i++) 
		{
			for(int j= 0;j<array[i].length;j++)
			{
				for(int k = 0;k<array[i][j].length;k++)
				{
					array[i][j][k] = randomNum(10)+1;
				}
			}
		}
	}

	static void printArray3D(int [][][]array)
	{
		for(int [][]a : array)
		{
			for(int []b : a)
			{
				for(int c : b)
				{
					System.out.printf("%3d",c);
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
	static void arraysort(int [][][]array)
	{
		for(int [][]a : array)
		{
			for(int []b : a)
			{
				Arrays.sort(b);
			}
		}
	}
}
