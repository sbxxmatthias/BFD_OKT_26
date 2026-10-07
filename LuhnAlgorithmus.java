package de.explicatis.bfd;

import javax.swing.JOptionPane;

public class LuhnAlgorithmus {

	public static void main(String[] args) {
		String kartennummerS = JOptionPane.showInputDialog("Kreditkartennummer eingeben");
		int länge = kartennummerS.length();
		
		long kreditkartennummer = Long.parseLong(
				kartennummerS
				);
		
		
		long ziffer = 0;
		int summe = 0;
		
		int[] ziffern = new int[länge];
		
		for(int i = 1; i <= länge; i++) {
			ziffer = kreditkartennummer % 10;
			
			// Bin ich die zweite Ziffer?
			if(i % 2 == 0)
			{
				ziffer = ziffer * 2;
				if(ziffer > 9)
					ziffer -= 9;
			}
			
			summe += ziffer;
			// restliche Nummer aktualisieren
			kreditkartennummer = kreditkartennummer / 10;
			
			ziffern[länge-i] = (int) ziffer; 
		}
		
		if(summe % 10 == 0) {
			System.out.println("Nummer ist valide");
		} else {
			System.out.println("Nummer ist nicht valide");
		}
		
		// foreach (enhanced for)
		// Hier gibt es keinen Index, sondern das Element direkt. 
		for(int z : ziffern) {
			System.out.print(z + " | ");
		}
		
	}

}
