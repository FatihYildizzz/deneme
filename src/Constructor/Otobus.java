package Constructor;

public class Otobus {

	String marka = "RolsRoys";
	int fiyat=1000;
	String renk="Siyah";
	int kapasite=10;
	int lastikEbat=3215;
	int vergi=999999;
	
	public Otobus() {}
	
	
	public Otobus(String marka, int fiyat, String renk, int kapasite) {
				//marka fiyat renk kapasite
		
		this.marka=marka;
		this.fiyat=fiyat;
		this.renk=renk;
		this.kapasite=kapasite;
	}
	public void mesaj (String yaz) {
	
		System.out.println(yaz);
	}
	public int topla(int fyt, int vrg) {
		
		int tplmFyt=fyt+vrg;
		
		return tplmFyt;
	}
	
	
	
	
	
	
}
