
public class FriendTest
{
	public static void main(String[] args)
	{
		String[][][] names = {{{"ȫ�浿", "������"},{"����","�̹̿�"}},{{"������","������"},{"���μ�","����"}}};
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
