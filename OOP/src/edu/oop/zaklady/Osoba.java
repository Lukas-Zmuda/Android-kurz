package edu.oop.zaklady;

class Osoba {
	
	//instancne premenne
	//fields
	String meno;
	String priezvisko;
	int vek;
	//m - muz, z - zena, n - nezname
	char pohlavie;

	//konstruktory
	
	Osoba(){
		meno = "nezname";
		priezvisko = "nezname";
		vek = 10;
		pohlavie = 'n';
	}
	
	Osoba(String meno, String priezvisko, int vek, char pohlavie){
		this.meno = meno;
		this.priezvisko = priezvisko;
		if(vek > 0) {
			this.vek = vek;			
		}else {
			this.vek = 10;
		}
		this.pohlavie = pohlavie;
	}
	
	Osoba(String meno, String priezvisko){
		this(meno, priezvisko, 10, 'n');
	}
	
//	Osoba(String meno, String priezvisko){
//		this.meno = meno;
//		this.priezvisko = priezvisko;
//		this.vek = 10;
//		this.pohlavie = 'n';
//	}
	//metody
	
	void info() {
		System.out.println(celeMeno());
		System.out.println("Vek: " + vek);
		System.out.println("Pohlavie: " + pohlavieSlovom());
	}
	
	String celeMeno() {
		return meno + " " + priezvisko;
	}
	
	String pohlavieSlovom() {
		switch(pohlavie) {
		case 'm':
			return "muz";
		case 'z':
			return "zena";
		case 'n':
			return "nezname";
		default:
			return "-";
		}
	}
	
	
}
