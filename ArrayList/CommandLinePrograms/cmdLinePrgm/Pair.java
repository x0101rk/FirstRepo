package cmdLinePrgm;

public class Pair<T> {
	
	public Pair(T first, T second) {
		this.first = first;
		this.second = second;
	}
	public T getFirst() {
		return first;
	}
	public void setFirst(T first) {
		this.first = first;
	}
	public T getSecond() {
		return second;
	}
	public void setSecond(T second) {
		this.second = second;
	}
	private T first;
	private T second;
	
}