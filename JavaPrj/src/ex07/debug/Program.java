package ex07.debug;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("res/ex07/data.txt");
		Scanner scan = new Scanner(fis);

		for (int i = 0; i < 6; i++) {
			int num = scan.nextInt();
			System.out.printf("%d, ", num);
		}

		scan.close();
		fis.close();
	}

}
