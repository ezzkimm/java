public class FriendTest {
	// 2015111521 강가현
	// 본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.
	public static void main(String[] args) {

		String[][][] names = { { { "홍길동", "류셩룡" }, { "권율", "이미영" } },
				{ { "아이유", "이하이" }, { "조인성", "현빈" } } };

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
