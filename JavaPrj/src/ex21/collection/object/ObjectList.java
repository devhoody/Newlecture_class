package ex21.collection.object;

public class ObjectList {
	private Object[] data;
	private int index;
	
	public ObjectList() {
		data = new Object[3];
	}
	
	public void add(Object value) {
		data[index++] = value;
	}
	
	public Object get(int index) {
		return data[index];
	}
	public int size() {
		return index;
	}
}
