package de.explicatis.bfd;

import javax.swing.JOptionPane;

public class MainKino {

	public static void main(String[] args) {
		KinosaalOOP dueren = new KinosaalOOP("Saal Düren", 10, 20, true);
		KinosaalOOP hürth = new KinosaalOOP("Saal Dennis", 12, 25, false);
		
		dueren.zeigePlan();
		hürth.zeigePlan();
		
		// Methodenüberladung:
		// Verarbeitung mit unterschiedlichen Eingaben möglich.
		// Methode heißt gleich
		dueren.buchen(2, 5);
		dueren.buchen("3,5");
		dueren.zeigePlan();
		
		
		hürth = dueren;
		
		hürth.buchen(5,6);
		
		// zwei individuelle Säle, die an unterschiedlichen Stellen im Speicher leben
		// aber gleich aufgebaut sind. 
		KinosaalOOP chuck = new KinosaalOOP(); // Standardwerte
		KinosaalOOP chuck2 = new KinosaalOOP(); // Standardwerte
		
	
		
	}

}
