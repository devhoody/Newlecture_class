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
		
	}

}
