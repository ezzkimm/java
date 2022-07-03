/* 2018111947 김도희 */

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
		System.out.println("----- parent의 생성자 1 -----");
		
	}
	
	/* 생성자를 overloading한다. */
	/* 메서드의 이름은 같고, 매개변수의 인자 수, 타입, 순서 등은 달라야 한다. */
	public Parent(int b) {
		a = b;
		System.out.println("----- parent의 생성자 2 -----");
	}
	
	public void info() {
		System.out.println("a는 " + a + "입니다.");
		System.out.println();
	}
}

class Child extends Parent{
	public Child() {
		System.out.println("----- child의 생성자 -----");
	}
	
	/* Parent 클래스의 info()메서드를 Child 클래스에서 overriding한다.*/
	/* 메서드의 반환형, 이름, 매개변수 등이 모두 같아야 한다. */
	public void info() {
		System.out.println("이것은 overriding한 child의 method입니다.");
		a = 10;
		System.out.println("a는 " + a + "입니다.");
		System.out.println();
	}
}