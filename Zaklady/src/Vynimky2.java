
public class Vynimky2 {

	public static void main(String[] args) {
		
		try {
			metoda1();
		} catch (VelkeCisloException e) {
			e.printStackTrace();
		}

	}

	private static void metoda1() throws VelkeCisloException {
		metoda2();
		
	}

	private static void metoda2() throws VelkeCisloException {
		metoda3();
		
	}

	private static void metoda3() throws VelkeCisloException {
		
		throw new VelkeCisloException();
		
	}

}
