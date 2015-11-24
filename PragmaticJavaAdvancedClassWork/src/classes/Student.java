package classes;

public class Student {
	private int age;
	private String name;
	
	public void talk(){
		System.out.println("I do boring talk");
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
