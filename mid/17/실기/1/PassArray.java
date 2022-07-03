import java.util.Arrays;

public class PassArray 
{
	public static void main(String[] args)
	{
		int [][]arraySrc = {{1,2,3},{4,5},{6,7,8,9}};
		for(int i =0;i<arraySrc.length;i++)
		{
			for(int j =0;j<arraySrc[i].length;j++)
			{
				int [][]arrayDst = new int[i][j];
			}
		}
		
		for(int i =0;i<arraySrc.length;i++)
		{
			//System.arraycopy(arraySrc, 0, arrayDst, 0, arraySrc.length);
		}
		printArray2D(arraySrc);
		//printArray2D(arrayDst);
		
		for(int i =0;i<arraySrc.length;i++)
		{
			Arrays.fill(arraySrc[i],1);
		}
		printArray2D(arraySrc);
		//printArray2D(arrayDst);	
	}
	public static void printArray2D(int [][]array)
	{
		for(int []a : array)
		{
			for(int b : a)
			{
				System.out.printf("%2d",b);
			}
			System.out.println("");
		}
	}
}
