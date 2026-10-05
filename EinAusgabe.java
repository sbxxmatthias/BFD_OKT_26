import javax.swing.JOptionPane;

public class EinAusgabe {

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
		}
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
		
	}

}
