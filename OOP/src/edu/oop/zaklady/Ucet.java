package edu.oop.zaklady;

public class Ucet {
	
	private String cislo;
	private double zostatok;

	public Ucet(String cislo, double zostatok) {
		this.cislo = cislo;
		this.zostatok = zostatok;
	}
	
	public String getCislo() {
		return this.cislo;
	}
	
	public void setCislo(String cislo) {
		this.cislo = cislo;
	}
	
		
	public double getZostatok() {
		return zostatok;
	}

	public void setZostatok(double zostatok) {
		this.zostatok = zostatok;
	}

	
	public void info() {
		System.out.println("Ucet cislo: " + this.cislo);
		System.out.println("Zostatok na ucte: " + this.zostatok);
	}
	
	public void vklad(double suma) {
		if(suma > 0) {
			this.zostatok += suma;
			System.out.println("Vklad: " + suma + " | Zostatok: " + this.zostatok);
		}else {
			System.out.println("Nepovolena operacia!");
		}
	}
	
	public void vyber(double suma) {
		if(suma > 0) {
			if(suma < this.zostatok) {
				this.zostatok -= suma;
				System.out.println("Vyber: " + suma + " | Zostatok: " + this.zostatok);
			}else {
				System.out.println("Nedostatocne prostriedku na ucte!");
			}
		}else {
			System.out.println("Nepovolena operacia!");
		}
	}
	

}
