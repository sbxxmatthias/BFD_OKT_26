
public class Main {

	public static void main(String[] args) {
		System.out.println("Hallo Welt");

		int b = 10 * 2;
		
		boolean isSunny; // Deklaration 
		// Nur bei Erzeugung muss ich den Datentypen angeben !
		// Danach kann ich einfach den Variablennamen verwenden
		isSunny = true; // Definition
		// true und false sind sog. LIterale, also gültige Werte für
		// den Datentypen.
		isSunny = false;
		
		// In typsicheren Sprachen MUSS der Datentyp
		// der linken Seite mit der rechten zusammenpasse
		// isSunny = 9;
		
		// Das hier geht nicht !
		// 9 = isSunny;
		
		// Deklaration und Definition in EINEM Schritt
		int a = 10, d = 9;
		a = b * 2;
		
		
		char lieblingsBuchstabe = 'F'; // char in einfachen '
		
		long gross = 843023984092348L;
		double kommaZahl = 9.8389493;
		
		String meinText = "Es ist sonnig.";
		
		final int TEMPERATURE_HOT = 27;
		// TEMPERATURE_HOT = 30;
		d = TEMPERATURE_HOT; // Auslesen ist möglich
		// final Veriablen für:
		// Mathematische und physische Größen
		// Unveränderliche Werte innerhalb eines Programms
		
		System.out.println(Math.PI);
		// Math.PI = 96.1;
	}

}
