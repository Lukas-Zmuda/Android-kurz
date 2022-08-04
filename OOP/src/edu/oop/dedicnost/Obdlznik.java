package edu.oop.dedicnost;

public class Obdlznik extends Utvar{
	
	private int dlzka, sirka;
		
	public Obdlznik(int x, int y, int dlzka, int sirka, String farba) {
		super(x, y, farba);
		this.dlzka = dlzka;
		this.sirka = sirka;
		
	}
	
	public void nakresli() {
		System.out.println("Kreslim obdlznik na suradnici [" + this.getX() + ", " + 
							this.getY() + "] d = " + this.getDlzka() + ", s = " + this.getSirka() + ", farba: "
							+ this.getFarba());
	}
		
	public int getDlzka() {
		return dlzka;
	}

	public void setDlzka(int dlzka) {
		this.dlzka = dlzka;
	}

	public int getSirka() {
		return sirka;
	}

	public void setSirka(int sirka) {
		this.sirka = sirka;
	}

	@Override
	public String toString() {		
		return "Obdlznik d = " + this.dlzka + ", s = " + this.sirka;
	}	
	
	
}