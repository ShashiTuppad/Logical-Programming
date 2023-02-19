package sorting.logical;

public class Shashi {
	static void m1() {
		System.out.println("Hello m1");
		System.out.println("Bye m1");
	}
	static void m2() {
		System.out.println("Hello m2");
		m1();
		System.out.println("Bye m2");
	}
	static void m3() {
		System.out.println("Hello m3");
		m2();
		System.out.println("Bye m3");
	}

	public static void main(String[] args) {
		System.out.println("Hello Main");
		m3();
		System.out.println("Bye Main");

	}

}
