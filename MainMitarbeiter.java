package de.explicatis.bfd;

public class MainMitarbeiter {

	public static void main(String[] args) {
		Mitarbeiter thorsten = new Mitarbeiter("Thorsten F.", 5400.0);
		Mitarbeiter christoph = new Mitarbeiter("Christoph H.", 4200.0);
		
		/* System.out.println(thorsten.gehalt);
		thorsten.gehalt = 6000.0; */
		
		System.out.println(thorsten.getGehalt());
		// thorsten.setGehalt(6000);
		// thorsten.gehalt = 6000;
		thorsten.setGehalt(-500);
		
	}

}
