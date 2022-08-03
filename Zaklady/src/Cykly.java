
public class Cykly {

	public static void main(String[] args) {
		
		//cyklus s pevnym poctom opakovani
		
		for(int i = 0; i < 5; i++) {
			System.out.println((i + 1) + ". Ahoj");
		}
		
		for(int i = 0; i < 11; i = i + 2) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		//1:10
		//2:9
		//...
		//10:1
		
		for(int i = 1, j = 10; i < 11; i++, j--) {
			System.out.println(i + ":" + j);
		}
		
		//System.out.println("i = " + i);
		
		//cyklus s podmienkou na zaciatku
		
		int k = 12;
		while(k < 11) {
			System.out.print(k + ", ");
			k++;
		}
		System.out.println();
		
		//cyklus s podmienkou na konci
		
		k = 10;
		do {
			System.out.print(k + ", ");
			k--;
		}while(k > 0);
		System.out.println();
		
		//break, continue
		k = 1;
		while(true) {
			if(k == 5) {
				System.out.print("pat, ");
				k++;
				continue;
			}
			System.out.print(k + ", ");
			k++;
			if(k == 11) {
				break;
			}
		}
		
		System.out.println();

		System.out.println("Program pokracuje dalej ...");
	}

}
