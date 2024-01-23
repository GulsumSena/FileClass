package FileIslem;

public class Islem {
	private int sayi1;
	private int sayi2;
	private String oper;

	public Islem(int sayi1, int sayi2, String oper) {
		this.sayi1 = sayi1;
		this.sayi2 = sayi2;
		this.oper = oper;
	}

	public String getOper() {
		return oper;
	}

	public int getSayi1() {
		return sayi1;
	}

	public int getSayi2() {
		return sayi2;
	}

	public int islemYap() {
		int sonuc = 0;

		if (this.oper.equals("+")) {
			sonuc = this.sayi1 + this.sayi2;
			
		} else if (this.oper.equals("-")) {
			sonuc = this.sayi1 - this.sayi2;
			
		} else if (this.oper.equals("/")) {
			sonuc = this.sayi1 / this.sayi2;
			
		} else if (this.oper.equals("*")) {
			sonuc = this.sayi1 * this.sayi2;
			
		}
		return sonuc;
	}

}
