package de.explicatis.bfd;
import javax.swing.JOptionPane;

public class EinAusgabeVerzweigung {

	public static void main(String[] args) {
		
		// Eingabe über UI
		String einkommen = JOptionPane.
				showInputDialog("Gib mir mal Dein Einkommen");
		
		// "1500" + 500 => "1500" + "500" = "1500500"
		System.out.println(einkommen + 500);

		// "1500" => 1500 + 500 = 2000
		// System.out.println(Integer.parseInt(einkommen) + 500);
		
		int einkommenInt = Integer.parseInt(einkommen) + 500;
		System.out.println(einkommenInt);
		
		// Fallunterscheidung:
		// Beide Abfragen sind vollkommen unabhängig !
		if(einkommenInt <= 2000) {
			System.out.println("Geringverdiener !");
			System.out.println(einkommenInt);
			// von innen nach außen nicht zugreifbar
			// int inner = 0;
		}
		// von außen nach innen nicht. 
		// System.out.println(inner);
		
		// Vorsicht bei Überlagerung (hier: genau 2000)
		// if(einkommenInt >= 2000 && einkommenInt <= 5000) {
		// Vorsicht bei Lücken (hier: zwischen 2001 und 2101 nichts
		// if(einkommenInt > 2100 && einkommenInt <= 5000) {
		if(einkommenInt > 2000 && einkommenInt <= 5000) {
			System.out.println("Arbeitsknecht !");
		}
		
		boolean isImportantGuy = true;
		// if else if .. ist eine abhängige
		// Mehrfachverzweigung.
		// Das erste, was trifft, wird ausgeführt und danach
		// der gesamte Block verlassen. 
		if(einkommenInt <= 2000) {
			System.out.println("Geringverdiener !");
		}
		// Vorsicht bei mehreren Variablen in der Fallabfrage 
		// Sind wirklich alle Fälle dann abgedeckt !
		// else if(einkommenInt >= 2000 && einkommenInt <= 5000 
		//		&& isImportantGuy == true) {
		else if(einkommenInt >= 2000 && einkommenInt <= 5000) {
			System.out.println("Arbeitsknecht !");
		}
		// "in allen anderen Fällen!"
		// es besteht keine Pflicht zu einem else (wird sonst NICHTS ausgeführt)
		else {
			System.out.println("Reicher Schnösel !");
		}
		
		// Verzweigung mit "Alternativfall"
		if(einkommenInt <= 2000) {
			System.out.println("Arbeiterklasse !");
		}
		// kein else-if notwendig
		else {
			System.out.println("Dem ist nicht zu Trauen !");
		}
		
		
		if(einkommenInt <= 2000) {
			System.out.println("Geringverdiener !");
		}
		else if(einkommenInt >= 2000 && einkommenInt <= 5000) {
			System.out.println("Arbeitsknecht !");
		}
		// else ist nicht notwendig (optional). Bei 5001 würde keinFall zutreffen, 
		// also nichts ausgeführt. 
		
	}

}
