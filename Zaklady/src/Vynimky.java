import java.util.InputMismatchException;
import java.util.Scanner;

public class Vynimky {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Zadaj cislo: ");
			int c1 = sc.nextInt();
			
			if(c1 > 100) throw new VelkeCisloException();
			
			System.out.println("Zadaj cislo: ");
			int c2 = sc.nextInt();			
			int vysledok = c1 / c2;
			System.out.println(c1 + " / " + c2 + " = " + vysledok);			
		}catch(ArithmeticException e) {
			System.out.println("Nemozno delit nulou!");
		}catch(InputMismatchException ie) {
			System.out.println("Nespravny vstup!");
		}catch(VelkeCisloException ve) {
			System.out.println(ve.getMessage());
			//System.exit(0);
		}catch(Exception ee) {
			System.out.println("Nastala nejaka chyba!");
		}finally {
			System.out.println("Toto sa vykona stale");
		}
		
		System.out.println("Program pokracuje dalej ...");

	}

}
