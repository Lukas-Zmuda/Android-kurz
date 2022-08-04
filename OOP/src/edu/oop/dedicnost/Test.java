package edu.oop.dedicnost;

import edu.oop.zaklady.Ucet;

public class Test {

	public static void main(String[] args) {

		//Ucet u = new Ucet("77777777", 1000);
		//u.info();
	
		Kruh k = new Kruh(1, 1, 10, "cervena");
		k.nakresli();
		
		Obdlznik o = new Obdlznik(1, 4, 45, 12, "zelena");
		o.nakresli();
		
	
		System.out.println(o);
		
		Kruh k2 = new Kruh(1, 1, 10, "cervena");
		System.out.println(k == k2);
		System.out.println(k.equals(k2));

	}

}
