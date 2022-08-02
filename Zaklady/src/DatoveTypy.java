
public class DatoveTypy {

	public static void main(String[] args) {
		
		//cele cisla
		int maleCislo;
		
		maleCislo = 12;
		int c = 1, x = 2;
		int xx = 1_123_456;
		
		
		byte b = 12;
		int bInt = b;
		b = (byte)bInt;
		
		int hex = 0xff;
		int oct = 0123;
		int bin = 0b10000000;
		
		
		System.out.println("hex = " + hex);
		System.out.println("oct = " + oct);
		System.out.println("bin = " + bin);
		
		//desatinne cisla
		double dd = 12.45;
		
		float ff = 1.45f;
		System.out.println((int)dd);
		
		//znaky
		char zavinac = '@';
		char znak = '\u0123';
		zavinac = 64;
		System.out.println(znak);
		
		//log. hodnoty
		boolean prsi = true; //false
		
		//retazce
		String meno = "Lukas";
		System.out.println(meno);
		
		int den1 = 12;
		

	}

}
