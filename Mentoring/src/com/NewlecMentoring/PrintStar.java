package com.NewlecMentoring;

public class PrintStar {

	public static void main(String[] args) {
		System.out.println("1");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++)
				if (i >= j)
					System.out.print("*");
			System.out.println(); 
		}

		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("2");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++)
				if (i <= -j + 4)
					System.out.print("*");
			System.out.println();
		}

		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("3");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++)
				if (i < -j + 4)
					System.out.print(" ");
				else
					System.out.print("o");
			System.out.println();
		}

		System.out.println("--------------------------------------------------------------------------------");

		System.out.println("4");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++)
				if (i > j)
					System.out.print(" ");
				else
					System.out.print("o");
			System.out.println();
		}

		System.out.println("--------------------------------------------------------------------------------");

		System.out.println("5");
		for(int i=0; i<5; i++) {
			for(int j=0; j<9; j++)
				if(i>=4-j && i >=-4+j)
					System.out.print("o");
				else
					System.out.print(" ");
			System.out.println();
		}
		
		System.out.println("--------------------------------------------------------------------------------");
		{
			System.out.println("6");
			
			for(int i=0; i<5; i++) {
				for(int j=0; j<9; j++)
					if(i>j || i+j >8)
						System.out.print(" ");
					else
						System.out.print("o");
				System.out.println();
			}
		}
	}
}
