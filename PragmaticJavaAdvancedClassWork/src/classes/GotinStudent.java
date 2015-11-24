package classes;

public class GotinStudent extends Student {
	private String haircutStyle;
	
	@Override //optional
	public void talk(){
		System.out.println("funny talk");
	}
	
	public void talk(int a){
		
	}
	
	public void sing(){
		System.out.println("sing random rock");
	}

	public String getHaircutStyle() {
		return haircutStyle;
	}

	public void setHaircutStyle(String haircutStyle) {
		this.haircutStyle = haircutStyle;
	}
}
