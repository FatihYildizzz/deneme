package GrupPractice;

import java.util.Arrays;
import java.util.Scanner;

public class StringIcindekiSayilarToplami {

	public static void main(String[] args) {
// kullanicidan icinde sayilarin da oldugu string bir ifade alin ve bu ifadenin icindeki sayilarin toplamini yazdirin
//output: 8   use--> Character.isDigit()    use-->Integer.valueOf()
		Scanner scan=new Scanner(System.in);
		System.out.println("icinde sayi yada sayilar olan bir kelime veya cumle giriniz");
		String str=scan.nextLine();
		String arr[]=str.split("");
		System.out.println(Arrays.toString(arr));
		
		int toplam=0;
		
		for (int i = 0; i < arr.length; i++) {
			if (Character.isDigit(arr[i].charAt(0))) {
				toplam+=Integer.valueOf(arr[i]);
			}
		}
		
		System.out.println("String ifadenin sayi degerleri toplami : " + toplam);

	}

}
