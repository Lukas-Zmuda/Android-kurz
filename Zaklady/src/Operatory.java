
public class Operatory {

	public static void main(String[] args) {

		//aritmeticke op.
		
		System.out.println(10 + 5);
		System.out.println(10 - 5);
		System.out.println(10 * 5);
		System.out.println(10.0 / 3);
		System.out.println(10 % 3);
		
		//relacne op.
		System.out.println(10 > 5);
		System.out.println(10 < 5);
		System.out.println(10 >= 5);
		System.out.println(10 <= 5);
		System.out.println(10 == 5);
		System.out.println(10 != 5);
		
		//logicke op.
		System.out.println(!(10 > 5));
		System.out.println((10 > 5) && false);
		System.out.println(true || false);
		
		int a = 10;
		
		a = a + 10;
		a += 10;
		
		a -= 10;
		
		a *= 10;
		a /= 10;
		a %= 10;
		
		
		a++; //a += 1 -> a = a + 1
		a--;
		
		++a;
		--a;
		
		a = 10;
		System.out.println(true || (a++ > 0));
		System.out.println("a = " + a);
		
		

	}

}
