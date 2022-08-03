import java.util.Scanner;

public class Vstup {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String meno = "";
		
		System.out.println("Ako sa volas?");
		meno = sc.nextLine();
		
		System.out.println("Ahoj " + meno + ".");
		
		System.out.println("V ktorom roku si sa narodil?");
		
		int rokNarodenia = 0;
		
		rokNarodenia = sc.nextInt();
		
		System.out.println("Mas " + (2022 - rokNarodenia) + " rokov.");		
		
	}

}
