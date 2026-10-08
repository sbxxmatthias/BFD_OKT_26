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
		
		
		/**
		 * 
		 * 
		 * 
=========
Lasse den Nutzer 10 Werte eingeben und berechne Summe und Durchschnitt der Werte im Array. 
ODER 
Erstelle eine Liste von Teilnehmern und konvertiere die Namen in Großbuchstaben
name.toUpperCase();

=========
Erstelle ein Array von Zahlen und gib diese in umgekehrter Reihenfolge auf der Konsole aus. 
Beispiel: 123456 => 654321

=========
Erstelle ein Array von Zahlen und drehe die Reihenfolge der Elemente mithilfe einer Schleife um. 
Setze den ersten Wert an die letzte Stelle und den letzten Wert an die erste Stelle usw. 
Baue deine Schleife so, dass du kein weiteres Array benötigst.


		 */
			
	}

}
