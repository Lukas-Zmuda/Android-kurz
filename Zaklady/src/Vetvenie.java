
public class Vetvenie {

	public static void main(String[] args) {
		
		int x = -11;
		
		//neuplna podmienka

		if(x > 0) {
			System.out.println("x je kladne cislo");
		}
		
		//uplna podmienka
		if(x % 2 == 0) {
			System.out.println("x je parne");
		}else {
			System.out.println("x je neparne");
		}
		
		int skore = 74;
		
		if(skore > 90) {
			System.out.println(1);
		}else if(skore > 80) {
			System.out.println(2);
		}else if(skore > 70) {
			System.out.println(3);
		}else if(skore > 60) {
			System.out.println(4);
		}else {
			System.out.println(5);
		}
		
		int den = 4;
//		if(den == 1) {
//			System.out.println("Pondelok");
//		}
		
		switch(den) {
		case 1:
			System.out.print("Pondelok");
			break;
		case 2:
			System.out.print("Utorok");
			break;
		case 3:
			System.out.print("Streda");
			break;
		case 4:
			System.out.print("Stvrtok");
			break;
		case 5:
			System.out.print("Piatok");
			break;
		case 6:
			System.out.print("Sobota");
			break;
		case 7:
			System.out.print("Nedela");
			break;
		default:
			System.out.println("Neznamy den v tyzdni");
		}
		
		switch(den) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println(" - pracovny den");
			break;
		case 6:
		case 7:
			System.out.println(" - vikend");
			break;
		}
		
		double plat = 1200;
		int pocetOdpracovanychRokov = 9;
		
		//vsetci zamestnanci, ktori maju odpracovane viac ako 10 rokov budu mat zvyseny plat o 30%, ostatni 10%
//		if(pocetOdpracovanychRokov > 10) {
//			plat = plat * 1.3;
//		}else {
//			plat = plat * 1.1;
//		}
		
		plat = (pocetOdpracovanychRokov > 10)? plat * 1.3 : plat * 1.1;
		
		System.out.println("Plat = " + plat);
		
		
		System.out.println("Program pokracuje dalej ....");
	}

}
