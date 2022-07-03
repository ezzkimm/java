
public class FriendTest
{
	public static void main(String[] args)
	{
		String[][][] names = {{{"홍길동", "류성룡"},{"권율","이미영"}},{{"아이유","이하이"},{"조인성","현빈"}}};
		int[][][] ages = {{{28,50},{25,22}},{{21,18},{33,32}}};
		Friend[][][]f = new Friend[2][2][2];
		
		for(int i=0;i<f.length;i++)
		{
			Friend []f = new
			for(int j=0;j<f[i].length;j++)
			{
				for(int k=0;k<f[i][j].length;k++)
				{
					f[i][j][k] = Friend(names[j][k],ages[j][k]);
				}
			}
		}
		for(Friend [][]a : f)
		{
			for(Friend []b : a)
			{
				for(Friend c : b)
				{
					System.out.println(c);
				}
			}
		}
	}
}
class Friend
{
	private String[] names;
	private int[] ages;
	
	Friend(String[] names, int[] ages)
	{
		this.names = names;
		this.ages = ages;
	}
	void setNA(String[] names,int[] ages)
	{
		this.names = names;
		this.ages = ages;
	}
	String[] getN()
	{
		return names;
	}
	int[] getA()
	{
		return ages;
	}
}
