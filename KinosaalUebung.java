
package de.explicatis.bfd;

import java.awt.TrayIcon.MessageType;

import javax.swing.JOptionPane;

public class KinosaalUebung {

	public static void main(String[] args) {
// Kino-Szenario
// 10 Sitzreihen zu JEWEILS 20 Sitzplätze
// Sitzplatz Buchen !
// z.b 2, 5 => 'X'
// Wenn frei: 'F'
// Reihe 1, jeweils 2 Plätze außen => 'N'
// mehrfach wiederholbar:
// 1 Platz buchen
// 2 Stornieren (optional)
// 3 Kinosaal anzeigen
// B - Beenden
//Möglicher Lösungsweg:
//do..while außen rum
//Menüpunkte
//Auswertung der Eingabe des Menüs in einem switch case
//In den cases werden die aktionen eingefügt
//Bei der Buchung muss die Postion in der Liste neu geschrieben werden.
//Vorsicht: Gebuchte Plätze nicht nochmal buchen!
//Nur gültige Sitze auswählen, nicht außerhalb des Saals
		int eingabe = 0;
		int eingabeReihe = 0;
		int eingabeSitz = 0;
		String eingabeZahl = "";
		final int MAX_SITZ = 20;
		final int MAX_REIHE = 10;
		char[][] kinosaal = new char[MAX_REIHE][MAX_SITZ];
		
		
		
		init(MAX_SITZ, MAX_REIHE, kinosaal);
		
		do {
			//Menue
			// Problematisch bei Eingaben als text
			// parseInt "weiß nicht weiter" und entscheidet auch nicht, was in dem Fall einer
			// fehlerhfaten Eingabe passiert.
			
			eingabe = auswahl();

			switch (eingabe) {
			//Platz buchen
			case 1:
				eingabeReihe = reiheEingabe(MAX_REIHE);
				eingabeSitz = sitzEingabe(eingabeSitz, MAX_SITZ);
				prüfeEingabe(eingabeReihe, eingabeSitz, MAX_SITZ, MAX_REIHE, kinosaal);
				break;
			//Storno
			case 2:
				JOptionPane.showMessageDialog(null, "Alle gewählten Sitzplätze wurden storniert!");
				init(MAX_SITZ, MAX_REIHE, kinosaal);
				break;
			//Kinosaal anzeigen
			case 3:
				zeigePlan(MAX_SITZ, MAX_REIHE, kinosaal);
				break;
			//Beenden
			case 4:
				beenden();
				break;
			case 5:
				continue;
			default:
				JOptionPane.showMessageDialog(null, "Ungültige Angabe.");
			}
		} while (eingabe != 4);
	}



	private static void init(final int MAX_SITZ, final int MAX_REIHE, char[][] kinosaal) {
		for (int i = 0; i < MAX_REIHE; i++) {
			for (int j = 0; j < MAX_SITZ; j++) {
				kinosaal[i][j] = 'F';
				kinosaal[0][0] = 'N';
				kinosaal[0][MAX_SITZ - 1] = 'N';
			}
		}
	}



	private static void prüfeEingabe(int eingabeReihe, int eingabeSitz, final int MAX_SITZ, final int MAX_REIHE,
			char[][] kinosaal) {
		if (eingabeReihe < 1 || eingabeReihe > MAX_REIHE || eingabeSitz < 1 || eingabeSitz > MAX_SITZ) {
			JOptionPane.showMessageDialog(null, "Gewählter Sitzplatz existiert nicht!\n"
					+ "Bitte wählen Sie einen verfügbaren Sitzplatz aus.\n"
					+ "Über Menüpunkt 3 können Sie sich die freien Plätze anzeigen lassen. ");
		}

		else if ((eingabeReihe == 1) && (eingabeSitz == 1)) {
			JOptionPane.showMessageDialog(null, "Gewählter Sitzplatz ist nicht verfügbar!\n"
					+ "Bitte wählen Sie einen verfügbaren Sitzplatz aus.\n"
					+ "Über Menüpunkt 3 können Sie sich die freien Plätze anzeigen lassen. ");
		}

		else if ((eingabeReihe == 1) && (eingabeSitz == MAX_SITZ)) {
			JOptionPane.showMessageDialog(null, "Gewählter Sitzplatz ist nicht verfügbar!\n"
					+ "Bitte wählen Sie einen verfügbaren Sitzplatz aus.\n"
					+ "Über Menüpunkt 3 können Sie sich die freien Plätze anzeigen lassen. ");
		}

		else if (kinosaal[eingabeReihe - 1][eingabeSitz - 1] == 'X') {
			JOptionPane.showMessageDialog(null, "Gewählter Sitzplatz ist bereits vergeben!\n"
					+ "Bitte wählen Sie einen verfügbaren Sitzplatz aus.\n"
					+ "Über Menüpunkt 3 können Sie sich die freien Plätze anzeigen lassen. ");
		}

		else if (kinosaal[eingabeReihe - 1][eingabeSitz - 1] == 'F') {
			JOptionPane.showMessageDialog(null, "Gewählter Sitzplatz:\n"
					+ "Reihe: " + eingabeReihe + "\n" + "Sitz: " + eingabeSitz);
			kinosaal[eingabeReihe - 1][eingabeSitz - 1] = 'X';
		}
	}



	private static int reiheEingabe(final int MAX_REIHE) {
		int eingabeReihe;
		eingabeReihe = Integer.parseInt(
				JOptionPane.showInputDialog("Bitte wählen Sie die Reihe. \n" + "Verfügbar: Reihe 1 bis " + MAX_REIHE +  "\n"));
		return eingabeReihe;
	}



	private static int sitzEingabe(int eingabeReihe, final int MAX_SITZ) {
		int eingabeSitz;
		eingabeSitz = Integer.parseInt(JOptionPane.showInputDialog("Gewählte Reihe: " + eingabeReihe
				+ "Bitte wählen Sie den Sitzplatz. \n" + "Verfügbar: Sitz 1 bis " + MAX_SITZ + "\n"));
		return eingabeSitz;
	}



	private static void beenden() {
		JOptionPane.showMessageDialog(null, "Bestellung abgeschlossen!");
	}



	private static void zeigePlan(final int MAX_SITZ, final int MAX_REIHE, char[][] kinosaal) {
		String saalplan;
		saalplan = "";
		for (int i = 0; i < MAX_REIHE; i++) {
			for (int j = 0; j < MAX_SITZ; j++) {
				System.out.print(kinosaal[i][j] + " | ");
				saalplan = saalplan + kinosaal[i][j] + " | ";
			}
			System.out.println();
			saalplan = saalplan + "\n";
		}
		JOptionPane.showMessageDialog(null, saalplan);
	}
	
	
	
	private static int auswahl() {
		int eingabe = 0;
		try {
			eingabe = Integer.parseInt(JOptionPane.showInputDialog(
					"Bitte wählen Sie die Zahl, um die Aktion durchzuführen: \n"
							+ "(1) Platz buchen \n" + "(2) Storno \n" + "(3) Kinosaal anzeigen \n" + "(4) beenden \n"
					));
		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Bitte nur Zahlen eingeben", "Fehler", 0);
			eingabe = 5;
		}
		
		return eingabe;
	}
	
	
	
	
	
}
