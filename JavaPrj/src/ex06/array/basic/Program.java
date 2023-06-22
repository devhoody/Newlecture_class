package ex06.array.basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		int[] nums = new int[100];
		int size = 0;

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
			System.out.println();
		}
		// 값 바꾸기

		{
			int temp; // 선언
			temp = nums[0]; // nums[0] -> num_
			nums[0] = nums[index]; // nums[index] -> num[0]
			nums[index] = temp; // num_ -> nums[index]

		}
		// index[0]<->90 nums 출력하기
		{
			for (int i = 0; i < size; i++) {
				System.out.printf("%d, ", nums[i]);
			}
			System.out.println();
		}

		// 제일 큰 값 찾기
		{
			int max = nums[0];

			// 반복횟수 : size -1
			for (int i = 0; i < size - 1; i++) {
				if (max < nums[i + 1])
					max = nums[i + 1];
			}
			System.out.printf("max : %d\n", max);
		}

		// 자리바꾸기 방식으로 큰 값을 찾기
		{
			for (int i = 0; i < size - 1; i++) {
				if (nums[i] > nums[i + 1])
					nums[i + 1] = nums[i];
			}
			System.out.printf("max : %d\n", nums[size - 1]);
		}

		// data.txt에 값 저장
		{
			FileOutputStream fos = new FileOutputStream("res/array/data-out.txt");
			PrintWriter pw = new PrintWriter(fos, true, Charset.forName("UTF-8"));

			for (int i = 0; i < size; i++)
				pw.printf("%d ", nums[i]);

			pw.flush();

			pw.close();
			fos.close();
		}

	}

}
