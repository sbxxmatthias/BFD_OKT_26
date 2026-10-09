package de.explicatis.bfd;

public class Zutat {
	String material;
	int menge;
	
	
	public Zutat(String material, int menge) {
		super();
		this.material = material;
		this.menge = menge;
	}
	
	public void info() {
		System.out.println(this.material + " " + this.menge);
	}
	
}
