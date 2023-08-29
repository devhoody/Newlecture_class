package ex21.collection.object;

public class GList<T> {
	private Object[] data;
	private int index;
	
	public GList() {
		data = new Object[3];
	}
	
	public void add(T value) {
		data[index++] = value;
	}
	
	public T get(int index) {
		return (T)data[index];
	}
	public int size() {
		return index;
	}
}
