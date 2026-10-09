package de.explicatis.bfd;

import java.util.ArrayList;

public class Rezept {
	
	String titel;
	String anleitung;
	ArrayList<Zutat> zutaten;
	
	public Rezept(String titel, String anleitung) {
		super();
		this.titel = titel;
		this.anleitung = anleitung;
		
		zutaten = new ArrayList<Zutat>();
	}
	
	// public void addZutat(Zutat z, int i) {
	public void addZutat(Zutat z) {
		zutaten.add(z);
		// zutaten[i] = z; // i kann man als Positionsindex mitgeben
	}
	
	public void info() {
		System.out.println("Für das Rezept: " + titel);
		for(Zutat z : zutaten) {
			z.info();
		}
		System.out.println("Und so geht es: " + anleitung);
	}
}
