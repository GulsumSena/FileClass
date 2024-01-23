package FileIslem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.temporal.ValueRange;
import java.util.ArrayList;
import java.util.Iterator;

public class FileClass {

	public static void main(String[] args) throws MyExc, Exception {

		StringBuilder sb = new StringBuilder();

		File f = new File("C:/Users/user/Desktop/dnm.txt");

		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);

		char[] operator = {'+','-','/','*'};

		String oku=br.readLine();

		while (1==1) {
			if(!oku.contains("+") && !oku.contains("-") && !oku.contains("/") && !oku.contains("*")) {
				throw new MyExc("Operatör Hatası", "Hata");
			}else {
				for (int i = 0; i < oku.length(); i++) {
					for (int j = 0; j < operator.length; j++) {				
						if (oku.charAt(i) == operator[j]) {
							String s1 = oku.substring(0, i);
							String op = oku.substring(i, i + 1);
							String s2 = oku.substring(i + 1, oku.length());

							int sayi1 = Integer.valueOf(s1);
							int sayi2 = Integer.valueOf(s2);

							Islem i1 = new Islem(sayi1, sayi2, op);				
						
							try {
								i1.islemYap();
							} catch (ArithmeticException e) {
								throw new MyExc("Bölme işleminin paydasına '0' yazılmaz.", "Hata");
							}
							
							sb.append(oku+"=" +i1.islemYap()+"\n");
						}
					}
				}
				
				FileWriter fw=new FileWriter(f);
				BufferedWriter bw=new BufferedWriter(fw);
				bw.write(sb.toString());
				oku=br.readLine();
				bw.close();
				fw.close();

				if (oku==null) {
					break;
				}
			}
			}
		}
}