package ex21.collection.object;

public class Program {

	public static void main(String[] args) {
		ObjectList list = new ObjectList();
		list.add(3);
		list.add("hello");
		list.add(2.44);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
