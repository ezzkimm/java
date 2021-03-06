/* 2018111947 ?赵?? */

public class FriendTest {
	public static void main(String[] args) {
		String[][][] names = {{{"ȫ?浿", "??????"}, {"????", "?̹̿?"}}, {{"??????", "??????"}, {"???μ?", "????"}}};
		int[][][] ages = {{{28, 50}, {25, 22}}, {{21, 18}, {33, 32}}};
		
		Friend[][][] friends = new Friend[2][][];
		
		for(int i = 0; i < friends.length; i++)
			friends[i] = new Friend[2][];
		
		for(int i = 0; i < friends.length; i++)
			for(int j = 0; j < friends[i].length; j++)
				friends[i][j] = new Friend[2];
		
		for(int i = 0; i < friends.length; i++)
			for(int j = 0; j < friends[i].length; j++)
				for(int k = 0; k < friends[i][j].length; k++)
					friends[i][j][k] = new Friend(names[i][j][k], ages[i][j][k]);
		
		for(Friend[][] i : friends) {
			for(Friend[] j : i)
				for(Friend k : j)
					System.out.println(k);
			System.out.println();
		}
	}
}

class Friend {
	private String name;
	private int age;
	
	public Friend(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + " " + age;
	}
}