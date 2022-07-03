/* 2018111947 �赵�� */

public class Test {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.info();
		
		Parent p2 = new Parent(5);
		p2.info();
		
		Child c = new Child();
		c.info();
	}
}

class Parent {
	int a;
	
	public Parent() {
		this(0);
		System.out.println("----- parent�� ������ 1 -----");
		
	}
	
	/* �����ڸ� overloading�Ѵ�. */
	/* �޼����� �̸��� ����, �Ű������� ���� ��, Ÿ��, ���� ���� �޶�� �Ѵ�. */
	public Parent(int b) {
		a = b;
		System.out.println("----- parent�� ������ 2 -----");
	}
	
	public void info() {
		System.out.println("a�� " + a + "�Դϴ�.");
		System.out.println();
	}
}

class Child extends Parent{
	public Child() {
		System.out.println("----- child�� ������ -----");
	}
	
	/* Parent Ŭ������ info()�޼��带 Child Ŭ�������� overriding�Ѵ�.*/
	/* �޼����� ��ȯ��, �̸�, �Ű����� ���� ��� ���ƾ� �Ѵ�. */
	public void info() {
		System.out.println("�̰��� overriding�� child�� method�Դϴ�.");
		a = 10;
		System.out.println("a�� " + a + "�Դϴ�.");
		System.out.println();
	}
}