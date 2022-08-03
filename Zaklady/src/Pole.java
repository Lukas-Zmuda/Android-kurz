
public class Pole {

	public static void main(String[] args) {
		
		int a = 10;
		
		//deklaracia pola
		int[] cisla;
		
		//inicializacia pola
		cisla = new int[5];
		
		cisla[0] = -3;
		cisla[1] = cisla[0] + 5;
		cisla[2] = 12;
		cisla[3] = 7;
		cisla[4] = 99;
		
		for(int i = 0; i < cisla.length; i++) {
			System.out.print(cisla[i] + ", ");
		}
		System.out.println();
		
		String[] mena = {"Lukas", "Jakub", "Lenka", "Natalia"};
		System.out.println("Pocet mien v zozname: " + mena.length);
		
		System.out.println("Prvy v zozname je " + mena[0]);
//		for(int i = 0; i < mena.length; i++) {
//			System.out.println((i + 1) + ". " + mena[i]);
//		}
		
		for(String m: mena) {
			System.out.print(m + ", ");
		}
		System.out.println();

		
		
	}

}
