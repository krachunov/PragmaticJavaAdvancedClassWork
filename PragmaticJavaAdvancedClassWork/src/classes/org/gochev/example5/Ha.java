package classes.org.gochev.example5;

public class Ha {

	public int age;
	
	Inner inner = new Inner();
	
	public class Inner {
		public void doSometing(){
			System.out.println(age);
		}
	}
	
	public static class StaticInner {
		public void doSomething(){
			
		}
	}
	
}
