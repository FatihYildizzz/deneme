package GrupPracticeAritmaTesisi;

import java.util.Scanner;

public class firstTwo {

	public static void main(String[] args) {
		
	firstTwo();
			  
	
	}			    
		
	private static String firstTwo() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 2 veya 2 den fazla harf iceren kelime giriniz");
		String str=scan.nextLine();
		if(str.length()>=2) {
			System.out.println(str.substring(0, 2));
		}if(str.length()<2) {
			System.out.println("X");
		}if(str.isEmpty()) {
			System.out.println("yields the empty string");
		}
		return str;
		
		
	}  
}
