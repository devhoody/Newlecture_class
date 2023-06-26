package ex07.zarray;

public class Program2 {

	public static void main(String[] args) {
		// 톱니형 격자 크기의 배열 생성
		// 소대장만 지정 후 , 나중에 소대원 모집.
		int[][] lottos = new int[3][];

		{
			int[] temp = new int[6];
			temp[0] = 2;
			temp[1] = 3;

			lottos[0] = temp;
			System.out.println(lottos[0]);
			System.out.println(lottos[0][1]);
		}
	}

}
