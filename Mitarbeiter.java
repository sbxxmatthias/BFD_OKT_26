package de.explicatis.bfd;

public class Mitarbeiter {
	private String name;
	private double gehalt;
	
	public Mitarbeiter(String name, double gehalt) {
		super();
		this.name = name;
		this.gehalt = gehalt;
	}

	// Setter / Getter:
	// Warum?
	// 1. Man kann unterscheiden, ob Attribute nur lesbar sind, beschreibbar oder beides
	// 2. Man kann an einer zentralen Stelle Plausibilitätsprüfungen einbauen (z.B. nur positives Gehalt)
	// 3. zentrale Fehlererkennung und Exception Handling. 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGehalt() {
		return gehalt;
	}

	public void setGehalt(double gehalt) {
		// Plausibilitätsprüfung
		if(gehalt >= this.gehalt) // oder >= 600
			this.gehalt = gehalt;
	}
}
