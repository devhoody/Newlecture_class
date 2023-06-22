package com.NewlecMentoring;

public class NestLeap {

	public static void main(String[] args) {
		{
			int number = 1;
			while (number != 100) {
				if (number % 2 == 0)
					System.out.print("+");
				else
					System.out.print("-");
				number++;
			}
			System.out.print("100");
			System.out.println();
		}
		System.out.println("------------------------------------------------------------------------------");

		{
			int number = 1;
			int n = 0;
			while (number != 100) {
				if (number % 2 == 0)
					System.out.print("+");
				else
					System.out.print("-");
				number++;
				n++;
				if (n % 10 == 0)
					System.out.println();
			}
			System.out.println("100");
		}
		System.out.println("------------------------------------------------------------------------------");

		{
			for (int i = 2; i < 10; i++)
				for (int j = 1; j < 10; j++)
					System.out.printf("%d * %d = %d\n", i, j, i * j);
		}

		System.out.println("------------------------------------------------------------------------------");

		{
			for (int i = 2; i < 10; i++)
				for (int j = 1; j < 10; j++) {
					if (i * j % 2 == 0)
						continue;
					System.out.printf("%d * %d = %d\n", i, j, i * j);
				}
		}

	}

}
