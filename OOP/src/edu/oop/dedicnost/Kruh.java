package edu.oop.dedicnost;

public class Kruh extends Utvar {
	
	private int polomer;
	
	
	public Kruh(int x, int y, int polomer, String farba) {
		super(x, y, farba);
		this.polomer = polomer;		
	}
	
	public void nakresli() {
		System.out.println("Kreslim kruh na suradnici [" + this.getX() + ", " + 
							this.getY() + "] r = " + this.getPolomer() + ", farba: "
							+ this.getFarba());
	}
		
	public int getPolomer() {
		return polomer;
	}
	public void setPolomer(int polomer) {
		this.polomer = polomer;
	}

	@Override
	public boolean equals(Object obj) {		
		Kruh k = (Kruh) obj;		
		return (this.getX() == k.getX()) && (this.getY() == k.getY()) && (this.getPolomer() == k.getPolomer());
	}

	@Override
	public void posun(int x, int y) {
		this.setX(this.getX() + x);
		this.setY(this.getY() + y);
		
	}
}