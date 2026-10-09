package de.explicatis.bfd;

import java.util.ArrayList;

public class Kochbuch {
	
	// Rezept[] rezepte;
	
	String titel;
	ArrayList<Rezept> rezepte;
	
	
	
	public Kochbuch(String titel) {
		super();
		this.titel = titel;
		
		rezepte = new ArrayList<Rezept>();
	}

	// Implementierung des Kochbuch Szenarios:
	// 1. Klasse Kochbuch:
	// Strng titel;
	// Autor, Liste von Rezepten (Array), z.B. 10
	// Klasse Rezept hat Titel, Anleitung, Liste von Zutaten (Array vom Typ Zutat)
	// Zutat: Material, Menge
	// Es werden Methoden benötigt zum Hinzufügen eines Rezeotes bzw. von Zutaten
	// Ausgabe => Liste von Rezepten ausgeben lassen. 
	
	// main-Methode:
	// Erstellt ein Kochbuch und fügt einige Rezepte mit den jeweiligen Zutaten hinzu.
	
	public void addRezept(Rezept r) {
		rezepte.add(r);
	}
	
	/* public void addRezept(Rezept r, int i) {
		rezepte[i] = r;
	} */
	
	public static void main(String[] args) {
		Kochbuch jamie = new Kochbuch("Jamies Geheimnisse");
		// Test zum Hinzufügen neuer Rezepte und Zutaten.
		
		Zutat ei = new Zutat("Ei", 3);
		Zutat tomate = new Zutat("Tomate", 1);
		Zutat sahne = new Zutat("Sahne", 50);
		Zutat zwiebel = new Zutat("Öllisch", 1);
		
		Rezept kölschesRührei = new Rezept("Kölner Rührei", "Eier in die Pfanne schlagen und "
				+ "dann kütt et wie et kütt ");
		
		kölschesRührei.addZutat(ei);
		kölschesRührei.addZutat(tomate);
		kölschesRührei.addZutat(sahne);
		kölschesRührei.addZutat(zwiebel);
		
		kölschesRührei.info();
		
		jamie.addRezept(kölschesRührei);
		
		
	}
	
}
