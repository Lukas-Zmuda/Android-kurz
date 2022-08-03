
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
		

		System.out.println("Program pokracuje dalej ...");
	}

}
