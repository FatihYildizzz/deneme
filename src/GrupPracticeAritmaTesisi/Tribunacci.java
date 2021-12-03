package GrupPracticeAritmaTesisi;

import java.util.ArrayList;
import java.util.List;

public class Tribunacci {

		 public static void main(String[] args) {
		        /*Java Soru cozumleri 17 – Tribonacci Dizisi Olusturma
		        Tribonacci dizisi, genel olarak fibonacci dizisinin 
		        uclu hali olarak dusunulebilir. N. elemani bulabilmek icin 
		        (n-1)+(n-2)+(n-3) formulu kullanilir.
		        0 – 1 – 1 – 2 – 4 – 7 – 13 – 24 – 44 – …..
		        Diye devam eden dizidir. */     
		        List<Integer>tribonacci=new ArrayList<>();
		        tribonacci.add(0);
		        tribonacci.add(1);
		        tribonacci.add(1);
		        int sayi=0;
		        int sayac=100;
		        while (sayi<sayac) {         
		sayi=tribonacci.get(tribonacci.size()-3)+
		        tribonacci.get(tribonacci.size()-2)+
		        tribonacci.get(tribonacci.size()-1);
		tribonacci.add(sayi);       }
		        tribonacci.remove(tribonacci.size()-1);
		        System.out.println(tribonacci);
		            
		        }
		        
		    }