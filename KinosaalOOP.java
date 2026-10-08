package de.explicatis.bfd;

import javax.swing.JOptionPane;

public class KinosaalOOP {
	// Attribute festlegen, Eigenschaften
	private String name;
	private char[][] saalplan;
	private boolean is3D;
	
	// Mit einem Konstruktor können wir Objekte erzeugen !
	public KinosaalOOP() {
		this.name = "Saal Chuck Norris";
		this.saalplan = new char[15][35];
		this.is3D = true;
		
		init();
	}
	
	// Wir können als Programmierer einen Kinosaal erzeugen und dabei angeben,
	// WIE GENAU der aussehen soll. 
	public KinosaalOOP(String name, int reihen, int plätze, boolean is3D) {
		this.name = name;
		this.saalplan = new char[reihen][plätze];
		this.is3D = is3D;
		
		init();
	}
	
	// buchen 
	public void buchen(int reihe, int platz) {
		
		if(reihe-1 > saalplan.length || platz-1 > saalplan[0].length) {
			JOptionPane.showMessageDialog(null, "Bitte eine gültige Platzauswahl treffen", "Fehler", 0);
			return;
		}
		
		if(saalplan[reihe-1][platz-1] != 'X')
			saalplan[reihe-1][platz-1] = 'X';
	}
	
	
	private void init() {
		for (int i = 0; i < saalplan.length; i++) {
			for (int j = 0; j < saalplan[0].length; j++) {
				saalplan[i][j] = 'F';
			}
		}
	}
	
	// Was kann man mit einem Kinosaal machen?
	public void zeigePlan() {
		String saal = this.name + "\n";
		for (int i = 0; i < saalplan.length; i++) {
			for (int j = 0; j < saalplan[0].length; j++) {
				saal = saal + saalplan[i][j] + " | ";
			}
			saal = saal + "\n";
		}
		JOptionPane.showMessageDialog(null, saal);
	}
	
}
