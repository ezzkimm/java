/* 2018111947 김도희 */
/* 본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다. */

import java.util.Arrays;
public class PassArray{
	public static void main(String[] args) {
		int[][] arraySrc = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
		int[][] arrayDst = new int[3][];
		
		for(int i = 0; i < arraySrc.length; i++)
			arrayDst[i] = new int[arraySrc[i].length];
		
		for(int i = 0; i < arraySrc.length; i++)
			System.arraycopy(arraySrc[i], 0, arrayDst[i], 0, arraySrc[i].length);
		
		System.out.println("<< after copying arraySrc to arrayDst >>");
		System.out.println("arraySrc :");
		printArray2D(arraySrc);
		System.out.println("arrayDst :");
		printArray2D(arrayDst);
		
		for(int i = 0; i < arraySrc.length; i++)
			Arrays.fill(arraySrc[i], 1);
		
		System.out.println("<< after filling arraySrc with 1s >>");
		System.out.println("arraySrc :");
		printArray2D(arraySrc);
		System.out.println("arrayDst :");
		printArray2D(arrayDst);
	}
	
	public static void printArray2D(int[][] array) {
		for(int[] i : array) {
			for(int j : i)
				System.out.printf("%-2d", j);
			System.out.println();
		}
		System.out.println();
	}
}