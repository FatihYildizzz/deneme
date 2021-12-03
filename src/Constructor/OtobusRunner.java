package Constructor;

public class OtobusRunner {

	public static void main(String[] args) {
		
		Otobus otobus = new Otobus();
	 //obje  objeismi keyword constructor
	   
System.out.println(otobus.fiyat+" "+ otobus.kapasite+" "+ otobus.lastikEbat+" "+otobus.marka+" "+otobus.renk);
	
	otobus.mesaj("Ne yazsak acaba");
	
	System.out.println(otobus.topla(otobus.vergi, otobus.fiyat));
	
	System.out.println(otobus.topla(888888, 50000000));
	
	
	Otobus otobus1=new Otobus("Volvo",3000,"Gri",100);

	}

}
