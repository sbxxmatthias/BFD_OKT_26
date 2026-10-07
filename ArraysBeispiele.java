package de.explicatis.bfd;

import javax.swing.JOptionPane;

public class ArraysBeispiele {

	public static void main(String[] args) {
		String[] teilnehmer = new String[4]; 
		
		System.out.println(teilnehmer[0]); // null ist UNBELEGT
		
		// wir fangen bei 0 an zu zählen, 
		// Index des LETZTEN Elements ist IMMER Länge -1 
		teilnehmer[0] = "Aram";
		teilnehmer[1] = "Möhlenbrock";
		teilnehmer[2] = "Müller";
		teilnehmer[3] = "Winzen";
		
		// Was passiert hier?
		// Darf nicht überschritten werden ! Das Programm stürzt ab !
		// System.out.println(teilnehmer[4]);
		
		// Ausgabe des GANZEN Liste
		for(int i = 0; i < 4; i++) {
			System.out.println(teilnehmer[i]);
		}
		// ODER
		for(String t : teilnehmer) {
			System.out.print(t + " | ");
		}
		
		
		// mit JOptionPane befüllen
		for(int i = 0; i < 4; i++) {
			teilnehmer[i] = JOptionPane.showInputDialog("Bitte geben Sie den " + (i+1) + "-ten Namen ein");
		}
		
		for(int i = 0; i < 4; i++) {
			System.out.println(teilnehmer[i]);
		}
		
		int[] ziffern = { 1,2,3,4,5 };
		for(int z : ziffern) {
			System.out.print(z + " | ");
		}
		
		
	}

}
