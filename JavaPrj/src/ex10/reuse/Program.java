package ex10.reuse;

import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {
		ExamList list = new ExamList();

		ExamList.load(list);
		ExamList.print(list);

	}

}
