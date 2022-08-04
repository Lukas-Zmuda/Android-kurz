
public class StatickeMetody {

	public static void main(String[] args) {
			
		System.out.println("Program Staticka metoda");
		vlozCiaru();
		
		System.out.println("Nejaky text.....");
		vlozCiaru("____________________________");
		System.out.println("text ...");
		vlozCiaru(10, "*");
		System.out.println("10^2 = " + druhaMocnina(10));
		
		double[] pole = {10, 2, 3.5, 4, 7};
		System.out.println(spocitajPole(pole));
		
		int[] cisla = vytvorPole(12);
		vypisPole(cisla);
		
		System.out.println(spocitaj(1, 2, 3));
		System.out.println(spocitaj(1, 5, 78, 98, 102, -7));
		

	}
	
	//metody bez navratovej hodnoty
	static void vlozCiaru() {
		System.out.println("-------------------------");
	}
	
	static void vlozCiaru(String ciara) {
		System.out.println(ciara);
	}
	
	static void vlozCiaru(int dlzka, char znak) {
		for(int i = 0; i < dlzka; i++) {
			System.out.print(znak);
		}
		System.out.println();
	}
	
	static void vlozCiaru(int dlzka, String znak) {
		for(int i = 0; i < dlzka; i++) {
			System.out.print(znak);
		}
		System.out.println();
	}
	
	static void vypisPole(int[] pole) {
		for(int cislo: pole) {
			System.out.print(cislo + ", ");
		}
		System.out.println();
	}
	
	
	//metody s navratovou hodnotou
	static int druhaMocnina(int cislo) {
		int vysledok = cislo * cislo;
		return vysledok;
	}
	
	static double druhaMocnina(double cislo) {
		return cislo * cislo;
	}

	static double spocitajPole(double[] pole) {
		double suma = 0;
		for(double cislo: pole) {
			suma += cislo;
		}		
		return suma;
	}
	
	static int[] vytvorPole(int pocetPrvkov) {
		int[] pole = new int[pocetPrvkov];
		for(int i = 0; i < pocetPrvkov; i++) {
			pole[i] = (i + 1);
		}
		return pole;
	}
	
		
	static int spocitaj(int... params) {
		int suma = 0;
		for(int cislo: params) {
			suma += cislo;
		}
		return suma;
	}
}
