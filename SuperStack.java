
public class SuperStack<T> {

	private T[] items;
	private int top;
	
	@SuppressWarnings("unchecked")
	public SuperStack(int size){
		items = (T[]) new Object[size];
		this.items = items;
	}
	
	
	public boolean isEmpty() {
		return top == 0;
}

	public boolean isFull() {
	return true;
}

	public boolean push(T item) {
	return true;
}

	public boolean pop() {
	return true;
}
}
