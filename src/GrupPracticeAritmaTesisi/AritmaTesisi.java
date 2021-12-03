package GrupPracticeAritmaTesisi;

public class AritmaTesisi {

	public static void main(String[] args) {
		
	/*	Bir aritma tesisinde aritilan su miktari gunde 5000 metrekuptur. 
	    Aritilan her 1 metrekup suyun birim aritma bedeli aritilan su hacmine gore degismektedir. 
	    Tarife asagidaki gibidir:
			2.5 TL (0 – 30.000 metrekup arasi)
			3.0 TL (30.000 – 50.000 metrekup arasi)
			3,5 TL ( >50.000 metrekup )
			Buna gore, 1 yil boyunca gun gun aritma masraflarini toplam olarak bulan ve 
			asagidaki ekran goruntusune sahip olacak bir program hazirlayiniz.
			Aritma Tesisi Gunluk Aritma Masrafi Listesi
			……………………………………………….
			1.Gun Sonunda Masraf = …….. TL
			2.Gun Sonunda Masraf = ………TL
			3.Gun Sonunda Masraf = ………TL
			XX. Gun Sonunda Masraf = ……..TL      */
		
		int suMiktari=0;
		
		for (int  i= 1 ; i<=365 ; i++) {
			suMiktari+=5000;
			if(suMiktari<30000) {
				System.out.println(i+". gun sonundaki masraf "+(suMiktari*2.5)+" tl");
			}if(suMiktari>=30000&&suMiktari<50000) {
				System.out.println(i+". gun sonundaki masraf "+(suMiktari*3)+"tl");
			}if(suMiktari>=50000) {
				System.out.println(i+". gun sonundaki masraf "+(suMiktari*3.5)+"tl");
			}
			
		}
		
		
		

	}

}
