package edu.oop.factory;

public class Auto {
	
	private String vyrobca;
	private String model;
	private double objem;
	private double spotreba;
	private int rokVyroby;
	private String typPaliva;
	
	private Auto(String vyrobca, String model, double objem, double spotreba, int rokVyroby, String typPaliva) {
		super();
		this.vyrobca = vyrobca;
		this.model = model;
		this.objem = objem;
		this.spotreba = spotreba;
		this.rokVyroby = rokVyroby;
		this.typPaliva = typPaliva;
	}

	public String getVyrobca() {
		return vyrobca;
	}

	public void setVyrobca(String vyrobca) {
		this.vyrobca = vyrobca;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getObjem() {
		return objem;
	}

	public void setObjem(double objem) {
		this.objem = objem;
	}

	public double getSpotreba() {
		return spotreba;
	}

	public void setSpotreba(double spotreba) {
		this.spotreba = spotreba;
	}

	public int getRokVyroby() {
		return rokVyroby;
	}

	public void setRokVyroby(int rokVyroby) {
		this.rokVyroby = rokVyroby;
	}

	public String getTypPaliva() {
		return typPaliva;
	}

	public void setTypPaliva(String typPaliva) {
		this.typPaliva = typPaliva;
	}
	
	//factory metody
	public static Auto benzinovaFabia() {
		Auto a = new Auto("Skoda", "Fabia", 1.2, 5.6, 2022, "benzin");
		return a;
	}
	
	public static Auto dieslovyGolf() {
		Auto a = new Auto("Volkswagen", "Golf", 1.6, 5.2, 2022, "diesel");
		return a;
	}

	@Override
	public String toString() {
		return "Auto [vyrobca=" + vyrobca + ", model=" + model + ", objem=" + objem + ", spotreba=" + spotreba
				+ ", rokVyroby=" + rokVyroby + ", typPaliva=" + typPaliva + "]";
	}
	
	
	
	

}
