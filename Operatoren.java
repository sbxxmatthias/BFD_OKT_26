package de.explicatis.bfd;

public class Operatoren {

	public static void main(String[] args) {
		boolean isSunny = true;
		boolean isHot = true;
		boolean isTired = false;
		boolean result;
		
		// bei &&: ALLE Bedingungen müssen true sein,
		// damit am Ende true rauskommt. 
		result = isSunny && isHot; // result: true
		
		isSunny = false; isHot = true;
		result = isSunny && isHot; // result: false
		System.out.println("AND: " + result);
		
		// bei ||: MINDESTENS eine Bedingung muss TRUE sein.
		result = isSunny || isHot; // true
		System.out.println("OR: " + result);		
		
		// Es gibt noch das EXKLUSIVE ODER
		boolean chicken = true; boolean beef = false;
		result = chicken ^ beef; // false
		System.out.println("XOR: " + result);
		
		// Vorsicht: Reihenfolge der Ausführung
		// und der Operatoren ist WICHTIG !!
		isSunny = true; isHot = true; isTired = false; 
		result = isSunny || isHot && isTired;
		System.out.println("PRIO1: " + result);
		result = (isSunny || isHot) && isTired;
		System.out.println("PRIO2: " + result);		
		
		
		// Rechnen:
		int a = 10;
		int b = 3;
		
		int ergebnis = a + b; // 13
		ergebnis = a - b; // 7
		ergebnis = a * b; // 30
		ergebnis = a / b; // 3.333333 ODER 3 REST 1
		// alle Nachkommastellen werden NICHT berücksichtigt !
		System.out.println("Ganzzahldivision: " + ergebnis); // 3
		ergebnis = a % b; // 1, da 10 / 3 9 letzter ganze Divisor und Rest 1
		
		double ergD = a / b;
		System.out.println("Division: " + ergD); // 3.0
		double c = 3.0;
		ergD = a / c;
		// Es können nicht alle Fließkommazahlen exakt dargestellt werden.
		System.out.println("Division: " + ergD);
		
		ergD = a / c + a / c;
		System.out.println("Division: " + ergD);
		
		isSunny = true; isHot = true;
		result = isSunny == isHot; // true
		// wird true, wenn die Werte NICHT übereinstimmen
		result = isSunny != isHot; // false
		
		// Vergleichsoperatoren für Zahlen, boolean, char
		// So einfach NICHT für höhere Datentypen wie Zeichenketten.
		result = a == 10; // true
		result = a > 5; // true
		result = a < 10; // false
		result = a <= 10; // true
		
		// ASCII-Tabelle 
		// Jedes char bekommt eine Zahl und diese wird verglichen.
		// A B C D ... ' '  a b c d e
		result = 'Z' < 'a';
		System.out.println(result);
		
		// Vergleichsioperatoren nützlich für Fallabfragen !
		
		// Beispiel für Operatorenreihenfolge
		// Werte stehen repräsentativ für Variablen aus Eingabe oder Datei...
		result = (-10 + 20) * 3 <= 15 && 80 + 3 * -2 > 0; 
		
		
		int i = 0;
		i = i + 1;
		i += 1; // kombinierter Zuweisungsoperator
		i++; // Post-Inkrement
		++i; // Prä-Inkrement
		
		i = 0;
		System.out.println("Post-Inkrement von i: " + i++);
		System.out.println(i);
		
		i = 0;
		System.out.println("Prä-Inkrement von i: " + ++i);
		System.out.println(i);
		
		i = 0;
		// 0 + 2 + 1
		i = i++ + ++i + 1;
		System.out.println(i);
		
		i = 0;
		// 1 + 2 + 1
		i = ++i + ++i + 1;
		System.out.println(i);
	}

}
