package ex06.array.basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		int[] nums = new int[100];
		int size = 0;
//		FileInputStream fis = new FileInputStream("res/array/data.txt");
//		Scanner scan = new Scanner(fis);

		// 값 로드하기
		{
			FileInputStream fis = new FileInputStream("res/array/data.txt");
			Scanner scan = new Scanner(fis);

			for (int i = 0; scan.hasNext(); i++) {
				nums[i] = scan.nextInt();
				size++;
			}

			scan.close();
			fis.close();
		}

		// nums 출력하기
		// 100, 23,... 70,
		{
			for (int i = 0; i < size; i++) {
				System.out.printf("%d, ", nums[i]);
			}
			System.out.println();
		}
		// 위치 찾기
		int index = -1;
		{
			for (int i = 0; i < size; i++) {
				if (nums[i] == 90) {
					index = i;
					System.out.printf("90의 인덱스 : %d", index);
					break;
				}
			}

		}
		// 값 바꾸기

		{
			int num_ = nums[0];
			nums[0] = nums[index];
			nums[index] = num_;
//			for(int i=0; i<size; i++) {
//				if(i == 0)
//					nums[i] = nums[index];
//				else if(i == index)
//					nums[index] = num_;
		}

		{
			// 값 저장
			FileOutputStream fos = new FileOutputStream("res/array/data-out.txt");
			PrintWriter pw = new PrintWriter(fos);

			for (int i = 0; i < size; i++) {
				pw.printf("%d ", nums[i]);
			}

			pw.flush();

			pw.close();
			fos.close();
		}
	}

}
