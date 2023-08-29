package ex21.collection.object;

public class Program {

	public static void print(GList<? extends Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)+1);
		}
	}

	public static void main(String[] args) {
		GList<String> list = new GList<>();
		GList<Integer> list1 = new GList<>();

		list1.add(10);
		list1.add(50);

		list.add("hello");

		print(list1);
//		print(list);

	}

}
