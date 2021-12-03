package GrupPractice;

import java.util.Scanner;

public class OrnekSoru {

	public static void main(String[] args) {
/*		 Kullanicidan bir isim yazmasini isteyin, adin uzunlugu 3 olmalidır.
		 Ardindan, adın aynı karakterlere sahip olup olmadigini kontrol edin.
	Eger ayni karakterlere sahipse
	"isim ayni karakterlere sahiptir." yazdirin.
	Eger ayni kaakterlere sahip degilse
	"Dizenin benzersiz karakterleri var" yazdirin.
	Ternary kullanin. 												 */
		
		Scanner scan=new Scanner(System.in);
		  System.out.println("isim gir");
		  String isim=scan.next();
		  isim=isim.toLowerCase();
		 char h1=isim.charAt(0);
		 char h2=isim.charAt(1);
		 char h3=isim.charAt(2);
		 
			 String sonuc = isim.length()==3 ?
					(       h1==h2 && h2==h3?"isim ayni karakterlere sahiptir" : 
						   "Dizenin benzersiz karakterleri var"                                              )
						:"3 karakter degil";
			 System.out.println(sonuc);
			 scan.close();
	}
}
