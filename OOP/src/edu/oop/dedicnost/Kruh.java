package edu.oop.dedicnost;

public final class Kruh extends Utvar implements UtvarVypocty, Pohyb{
	
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

	@Override
	public void obvod() {
		System.out.println("o = " + 2 * Math.PI * this.polomer);
		
	}

	@Override
	public void obsah() {
		System.out.println("S = " + Math.PI * this.polomer * this.polomer);
		
	}

	@Override
	public void hore(int y) {
		this.setY(this.getY() - y);
		
	}

	@Override
	public void dole(int y) {
		this.setY(this.getY() + y);
		
	}

	@Override
	public void dolava(int x) {
		this.setX(this.getX() - x);
		
	}

	@Override
	public void doprava(int x) {
		this.setX(this.getX() + x);
		
	}
	
	public static double obsah(double polomer) {
		return Math.PI * polomer * polomer;
	}
}