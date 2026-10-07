package de.explicatis.bfd;

public class SwitchSample {
	public static void main(String[] args) {
		
		int stimmung = 15;
		String stimmungText = "";
		
		char auswahl = 'b';
		switch (auswahl) {
		case 'b':
			System.out.println("In B");
			// ... 
		}
		
		String auswahlS = "streicheln";
		switch (auswahlS) {
		case "streicheln":
			// später: Aktion aufrufen
			// tama.streicheln();
			// ... 
		}
		
		// switch case geht auch mit char und Strings 
		// z.B. für einen Menüaufbau 
		
		switch(stimmung) {
			case 0:
				stimmungText = "Am tieferen Tiefpunkt";
				break;
			case 1:
				stimmungText = "Könnte sehr viel besser sein";
				break;
			case 2:
				stimmungText = "Muss";
				break;
			case 3:
				stimmungText = "Gut";
				break;
			case 4:
				stimmungText = "Sehr gut";
				break;
			// "Durchlässigkeit" von cases ohne break. 
			case 5:
				System.out.println("Case 5 wird ausgeführt");
			case 6:
				stimmungText = "Prima, bald ist Karneval";
				break;
			default:
				stimmungText = "Weiß nicht.";
		}
		System.out.println(stimmungText);
		
		// Switch Expressions: Mapping int zu Text
		// Switch expression EXTRA FÜR ZUWEISUNGSOPERATIONEN !!
		String stimmunExp = switch (stimmung) {
			case 1 -> "Könnte sehr viel besser sein";
			case 2 -> "Muss"; // stimmunExp = "Muss";
			case 3 -> "Gut";
			// in ALLEN Fällen muss etwas zugewiesen werden, 
			// weil sonst stimmunExp NICHT definiert wäre (nicht möglich in Java). 
			default -> "Anderer Wert";
		};
		
		System.out.println(stimmunExp);
		
		Wochentag wt = Wochentag.DIENSTAG;
		switch (wt) {
			case DIENSTAG:
				System.out.println("AM DIENSTAG WERDEN DIENSZABRKEITEN ERBRACHT.");
				break;
		}
		
		
		String wochentag = switch (wt) {
		case SCHONTAG -> "Schontag";
		case DIENSTAG -> "Dienstag"; // stimmunExp = "Muss";
		case BERGFEST -> "Mittwoch";
		// in ALLEN Fällen muss etwas zugewiesen werden, 
		// weil sonst stimmunExp NICHT definiert wäre (nicht möglich in Java). 
		default -> "Anderer Wert";
	};
		
	}
	
	// Aufzählung: Zulässige, endliche Liste von Werten
	// geeignet für Kategorien, z.B. AUTO Antrieb (ELEKTRO, ...)
	enum Wochentag {
		SCHONTAG,
		DIENSTAG,
		BERGFEST,
		DÖNERSTAG,
		FRIDAY,
		SAMSTAG,
		SONNTAG
	}
	
	// matthias.hofmann@novabotics.group 
	
}
