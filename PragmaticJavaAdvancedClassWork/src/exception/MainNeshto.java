package exception;

import java.io.IOException;

public class MainNeshto {
	public static void main(String[] args) {
		Neshto n = new Neshto();
		try {
			n.sayTapak("Gosho");
		} catch (GoshoIsNotTapakException e) {
			e.printStackTrace();
		}
		
		try {
			n.sayTapak("nayden");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//always execute
		}
		System.err.println("programata prodaljava");
	}
}
