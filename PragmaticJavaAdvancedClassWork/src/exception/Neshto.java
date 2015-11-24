package exception;

public class Neshto {
	public void sayTapak(String name) throws GoshoIsNotTapakException{
		if("Gosho".equals(name)){
			throw new GoshoIsNotTapakException("Gosho ne e tapak");
		} else if ("nayden".equals(name)){
			throw new RuntimeException("runtime");
		}
		System.out.println(name +" e tapak");
	}
}
