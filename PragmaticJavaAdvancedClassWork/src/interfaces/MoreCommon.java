package interfaces;

public class MoreCommon<T,SOURCE> {
	T t;
	public T doSomething(T t){
		return t;
	}

	
	public static void main(String[] args) {
		MoreCommon<String, StringBuilder> common = new MoreCommon<>();
		
		
	}
}

