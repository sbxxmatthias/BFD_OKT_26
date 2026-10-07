package de.explicatis.bfd;

public class ForSchleifen {

	public static void main(String[] args) {
		// For Schleifen sind dann geeignet, wenn man die Anzahl 
		// der Durchläufe kennt. 
		
		// Wir zählen die Liegestützte !
		// i ist die LAUFVARIABLE i,j,k (Namenskonvention)
		// i macht es möglich. den Verlauf der Schleife zu verfolgen. 
		// Bei welchem Durchlauf in ich?
		
		// Weitere Infos, die notwendig sind:
		// WO STARTE ICH? int i = 0;
		// WIE WEIT WILL ICH ZÄHLEN??? i < 10, also BIS 9 !!
		// Welche SCHRITTWEITE will ich? i++ => i = i + 1;
		
		for(int i = 0; i < 10; i++) {
			System.out.print(i+1 + "| ");
		}
		
		System.out.println();
		System.out.println("Jetzt habe ich SOOOLCHE OBERARME");
		
		for(int i = 0; i < 10; i=i+2) {
			System.out.print(i+1 + "| ");
		}
		
		System.out.println();
		System.out.println("Jetzt habe ich SOOOLCHE OBERARME");
		
		for(int i = 4; i < 101; i=i+2) {
			System.out.print(i + "| ");
		}
		
		System.out.println();
		System.out.println("Jetzt habe ich SOOOLCHE OBERARME");
		
		String test = "";
		// continue
		for(int i = 1; i < 101; i++) {
			/* test = i + "";
			if (test.matches("[4]*"))
				System.out.println(i + "enthält eine Vier");
			*/
			
			if(i==4)
				continue;
			
			System.out.print(i + "| ");
			
			if(i%10==0) {
				System.out.println();
			}
		}
		
		// break in einer For-Schleife nur in besonderen Fällen
		// z.B. beim Primzahltest
		int prim = 55;
		boolean isPrim = true;
		
		for(int i = 2; i < prim / 2; i++) {
			if(prim % i == 0) {
				isPrim = false;
				break;
			}
		}
		
		
		// Spiel "FizzBuzz"
		// Zähle von 1 bis N (z.B. 100)
		// Alle Zahlen, die durch 3 teilbar sind, werden Durch "Fizz" ersetzt
		// Alle Zahlen, die Durch 5 teilbar sind, werden durch Buzz ersetzt. 
		// Alle Zahlen, die sowohl durch 3, als auch durch 5 teilbar sind, 
		// werden durch FizzBuzz ersetzt.
		// Optional: Alle durch 10 teilbaren Zahlen auslassen. 
		
		// Luhn Algorithmus: Implementieren !
		
		/*
		 * Schreibe ein Programm, das die Gültigkeit einer Kreditkartennummer mithilfe des Luhn Algorithmus überprüft. Der Benutzer sollte die Kreditkartennummer als Eingabe eingeben können, und das Programm sollte ausgeben, ob die Nummer gültig ist oder nicht.

Der Luhn Algorithmus, auch als Modulus 10 oder mod 10 Algorithmus bekannt, wird häufig zur Überprüfung der Gültigkeit von Kreditkartennummern verwendet. Hier ist eine vereinfachte Erläuterung des Algorithmus:

-	Durchlaufe die Nummer ziffernweise von rechts nach links und bilde die Summe der Ziffern
-	Verdoppele dabei jede zweite Ziffer, und wenn dabei ein Wert größer als 9 herauskommt, subtrahiere 9
-	Addiere alle Summen der Ziffern der Kreditkartennummer
-	Modulo 10 überprüfen: Überprüfe, ob die Summe durch 10 teilbar ist. Die Kreditkartennummer ist gültig, wenn die Summe durch 10 ohne Rest teilbar ist.


Gegeben sei die Beispielidentifikationsnummer 446667651

		 * 
		 */
		
		
		
	}

}
