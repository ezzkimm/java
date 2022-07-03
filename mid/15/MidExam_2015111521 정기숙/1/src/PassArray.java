import java.util.Arrays;

public class PassArray {
	// 2015111521 강가현
	// 본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.
	public static void main(String[] args) {

		int[][] arraySrc = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 } };
		int[][] arrayDst = new int[3][4];

		for (int i = 0; i < arraySrc.length; i++) {//<1>
			arrayDst[i] = new int[arraySrc[i].length];
		}

		for (int i = 0; i < arraySrc.length; i++)// <2>
		{
			System.arraycopy(arraySrc[i], 0, arrayDst[i], 0, arraySrc[i].length);
		}

		System.out.printf("<<after copying arraySrc to arrayDst >>\n");
		System.out.printf("arraySrc :\n");
		printArray2D(arraySrc);
		System.out.printf("\narrayDst :\n");
		printArray2D(arrayDst);// <3>

		for (int i = 0; i < arraySrc[0].length; i++)
			// <4>
			Arrays.fill(arraySrc[i], 1);

		System.out.printf("\n<<after filling arraySrc with 1s >>\n");
		System.out.printf("arraySrc :\n");
		printArray2D(arraySrc);

		System.out.printf("\narrayDst :\n");
		printArray2D(arrayDst);
	}

	public static void printArray2D(int[][] ary) {
		for (int[] i : ary)// <6>
		{
			for (int j : i) {
				System.out.printf("%2d", j);
			}
			System.out.println();
		}
	}

}
