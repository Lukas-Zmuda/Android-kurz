package edu.oop.dedicnost;

import java.util.ArrayList;

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
		
		Utvar uuu = new Kruh(10, 20, 45, "cierna");
		
		System.out.println("----------------");
		ArrayList<Utvar> utvary = new ArrayList<>();
		utvary.add(k2);
		utvary.add(o);
		utvary.add(new Kruh(2, 3, 20, "hneda"));
		utvary.add(new Obdlznik(5, 5, 10, 23, "zlta"));
		
		System.out.println("Pocet utvarov v zozname: " + utvary.size());
		for(Utvar u: utvary) {
			if(u instanceof Kruh) {
				System.out.print("(k)-" + u.getFarba() + ", ");
			}else if(u instanceof Obdlznik) {
				System.out.print("(o)-" + u.getFarba() + ", ");
			}else {
				System.out.print("neznamy objekt");
			}
		}
		System.out.println();
		
		//Utvar ut = new Utvar(-4, 5, "cervena");
		
		//ut.nakresli();
		

	}

}
