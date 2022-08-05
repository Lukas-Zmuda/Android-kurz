
public class VelkeCisloException extends Exception{

	@Override
	public String getMessage() {
		return "Zadal si prilis velke cislo!! ( > 100)";
	}
}
