public class FriendTest {
	// 2015111521 ������
	// ������ �� �ҽ������� �ٸ� ����� �ҽ��� �������� �ʰ� ���� �ۼ��Ͽ����ϴ�.
	public static void main(String[] args) {

		String[][][] names = { { { "ȫ�浿", "���ͷ�" }, { "����", "�̹̿�" } },
				{ { "������", "������" }, { "���μ�", "����" } } };

		int[][][] ages = { { { 28, 50 }, { 25, 22 } },
				{ { 21, 18 }, { 33, 32 } } };

		Friend[][][] myFriends = new Friend[2][2][2];

		for (int i = 0; i < myFriends.length; i++) {
			for (int j = 0; j < myFriends[i].length; j++) {
				for (int k = 0; k < myFriends[i][j].length; k++) {
					myFriends[i][j][k] = new Friend(names[i][j][k],
							ages[i][j][k]);
				}
			}
		}

		for (Friend[][] i : myFriends) {
			for (Friend[] j : i) {
				for (Friend k : j) {
					System.out.println(k);
				}
			}
			System.out.println();
		}

	}

}

class Friend {

	private String name;
	private int age;

	public Friend(String names, int ages) {
		name = names;
		age = ages;
	}

	public String toString() {
		return name + " " + age;
	}

}
