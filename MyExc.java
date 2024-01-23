package FileIslem;

public class MyExc extends Exception{
	
	private String info;
	
	public MyExc(String message, String info) {
		super(message);
		this.info=info;
	}
	
	public String getInfo() {
		return info;
	}
}
