
public class StringSamples {

	public static void main(String[] args) {
		String dienstnummer = "030700A86015";
		
		// Operationen (Methoden) auf einem String ausführen.
		String geburtsdatum = dienstnummer.substring(0, 6);
		System.out.println(geburtsdatum);
		
		dienstnummer = dienstnummer.replace('A', 'F');
		System.out.println(dienstnummer);
		
		// Es gibt keine zuverlässige Variante, mit == auf inhaltliche
		// Gleichheit zu überprüfen.
		String dienstnummer2 = "030700A86015";
		dienstnummer2 = dienstnummer2.replace('A', 'F');
		
		// Vergleich schlägt fehl !
		// == vergleicht die SPEICHERADRESSE, nicht den Inhalt
		boolean result = dienstnummer == dienstnummer2;
		System.out.println(result);
		
		// equals überprüft den INHALT !
		// kann in der Objektorientierung flexibek genutzt werden
		// z.B. nach welchem Kriterium werden Austos, Schlüssel, Laptops, ...
		// Bei Strings kann man neben dem Inhalt auch die Länge des Textes
		// einfach nur vergleichen. 
		result = dienstnummer.equals(dienstnummer2);
		
		
		dienstnummer = dienstnummer2;
		result = dienstnummer == dienstnummer2;
		System.out.println(result);
	}

}
