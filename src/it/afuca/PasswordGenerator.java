package it.afuca;


public class PasswordGenerator {

	static void generaPassword() {
		
		Utente Utente1 = new Utente(Utente.name, Utente.surname, Utente.color, Utente.day, Utente.month, Utente.year);
		
		String pwdGenerated = Utente.name + "-" + Utente.surname + "-" + Utente.color + "-" + (Utente.day + Utente.month + Utente.year);
		System.out.println(pwdGenerated);
		
		
		
	}

}
