package edu.oop.zaklady;

public class Tester {

	public static void main(String[] args) {
		
		//deklaracia objektu
		Osoba osoba;
		
		//inicializacia objektu
		osoba = new Osoba();
		
		osoba.info();
		
		Osoba osoba2 = new Osoba();
		
		osoba.meno = "Jan";
		osoba.priezvisko = "Hrasko";
		osoba.pohlavie = 'm';
		osoba.vek = 24;
		
		osoba2.meno = "Ruzena";
		osoba2.priezvisko = "Sipkova";
		osoba2.vek = 45;
		osoba2.pohlavie = 'z';
		
		
		System.out.println(osoba.celeMeno());
		System.out.println(osoba2.celeMeno());
		System.out.println(osoba.pohlavieSlovom());
		
		osoba2.info();
		
		System.out.println("-------------");
		
		Osoba os = new Osoba("Fero", "Mravec", 34, 'm');
		os.info();
		
		Osoba os2 = new Osoba("Maja", "Vcela");
		os2.info();
		
		
		

	}

}
