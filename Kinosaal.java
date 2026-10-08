package de.explicatis.bfd;

public class Kinosaal {

	public static void main(String[] args) {
		// Kino-Szenario
		// 10 Sitzreihen zu JEWEILS 20 Sitzplätze
		// Sitzplatz Buchen !
		// 2, 5 => 'X'
		// Wenn frei: 'F'
		// Reihe 1, jeweils 2 Plätze außen => 'N'
		// mehrfach wiederholbar:
		// 1 Platz buchen
		// 2 Stornieren (optional)
		// 3 Kinosaal anzeigen
		// B - Beenden
		
		
		// Möglicher Lösungsweg:
		// do .. while außen rum
		// Menüpunkte
		// Auswertung der Eingabe des Menüs in einem switch case
		// Bei der Buchung muss die Position in der Liste neu geschrieben werden. 
		// Vorsicht: Gebuchte Plätze nicht nochmal buchen !
		// Nur gültige Sitze auswählen (nicht außerhalb des Saals ;-)), z.B. 100, 300
		// in den cases werden die aktionen eingefügt 
		
		char[][] kinosaal = new char[10][20];
		
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 20; j++) {
				kinosaal[i][j] = 'F';
			}
		}
		
		
		// Serializable
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 20; j++) {
				System.out.print(kinosaal[i][j] + " | ");
			}
			System.out.println();
		}

	}

}
