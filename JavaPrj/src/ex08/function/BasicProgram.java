package ex08.function;

public class BasicProgram {

	static int power(int x) {
		
		return (x+3)*(x+3)+ x/3*(x-2)+5;
	}
	
	public static void main(String[] args) {
		int x = 7;
		int a = ((x+3)*(x+3)+ x/3*(x-2)+5+3) + (x+3)*(x+3)+ x/3*(x-2)+5 - ((x+3)*(x+3)+ x/3*(x-2)+5);
		int b = (power(x) +3) + power(x) - power(x);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(power(7));
		
		int a1 = f1();
		int a2 = f2(10, 20);
		f3(33);
		f4();
	}

	private static void f4() {
		// TODO Auto-generated method stub
		
	}

	private static void f3(int i) {
		// TODO Auto-generated method stub
		
	}

	private static int f2(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int f1() {
		// TODO Auto-generated method stub
		return 0;
	}

}
