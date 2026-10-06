package de.explicatis.bfd;

import java.util.Random;

import javax.swing.JOptionPane;

public class WhileSamples {

	public static void main(String[] args) {
		Random rand = new Random();
		
		// rand.nextGaussian(100, 20);
		// rand.nextExponential();
		
		int wurf = 0;
		int versuche = 0;
		
		// Bei true wird fortgesetzt
		while(wurf != 6) {
			// Würfel von 1-6
			wurf = rand.nextInt(1, 7);
			System.out.print(wurf + " | ");
			versuche++;
		}
		
		System.out.println();
		System.out.println("Du hast " + versuche + " Versuche gebraucht für eine 6");	
		
		
		wurf = 0;
		versuche = 0;
		
		
		while(true) {
			// Würfel von 1-6
			wurf = rand.nextInt(1, 7);
			System.out.print(wurf + " | ");
			versuche++;
			
			// bei GENAU 1er Anweisung muss keine { } gesetzt werden. 
			if(wurf == 6)
				break;
			// Diese Anweisungen würden nicht mehr ausgeführt werden
			// System.out.println("Ende Schleife");
		}
		
		System.out.println();
		System.out.println("Du hast " + versuche + " Versuche gebraucht für eine 6");		
		
		wurf = 0;
		versuche = 0;
		boolean flag = true;
		
		while(flag) {
			// Würfel von 1-6
			wurf = rand.nextInt(1, 7);
			System.out.print(wurf + " | ");
			versuche++;
			
			// bei GENAU 1er Anweisung muss keine { } gesetzt werden. 
			if(wurf == 6)
				flag = false;
			
			// Wenn HIER nochwas verarbeitet werden soll. 
			if(!flag) {
				// ternärer Operator / in Python: conditional expression
				flag = rand.nextBoolean() ? true : false;
			}
		}
		
		System.out.println();
		System.out.println("Du hast " + versuche + " Versuche gebraucht für eine 6");		
		
		
		// Zahlen raten:
		// Computer zieht eine Zufallszahl zwischen 1 und 100.
		// Die Zahl soll erraten werden !
		// Es gibt Hinweise: Wenn die geratene Zahl < der Computerzahl:
		// "Zahl ist größer"
		// Wenn die geratene Zahl > der Computerzahl:
		// "Zahl ist kleiner"
		// Anzahl der Versuche wird gezählt.
		// Optional: Maximal n Versuche
		
		// Eingabe: JOptionPane UND Integer.parseInt
		/* int gerateneZahl = Integer.parseInt(
					JOptionPane.showInputDialog("Zahl eingeben")
				);
		
		JOptionPane.showMessageDialog(null, "Zahl ist größer");
		*/ 
		
		// Startmenü für Taagotchi Spiel:
		// Nutzer soll die Anzeige des Menüs abbrechen können / das Spiel mit 'X'
		// beenden können
		 
		 wurf = 0;
		 versuche = 0;
		 
		 // 1 Durchlauf ist GARANTIERT
		 // Am Ende wird entschieden, ob nochmal wiederholt wird. 
		 do
		 {
			// Würfel von 1-6
			wurf = rand.nextInt(1, 7);
			System.out.print(wurf + " | ");
			versuche++;
		} while(wurf != 6);
		 
		 System.out.println();
		 System.out.println("Du hast " + versuche + " Versuche gebraucht für eine 6");		
			
		
	}

}
