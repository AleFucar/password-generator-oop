package it.afuca;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Utente Utente1 = new Utente(null, null, null, 0, 0, 0);
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Ciao! Immetti il tuo nome...");
		Utente1.name = scan.nextLine();

		System.out.println("inserisci adesso il tuo cognome...");
		Utente1.surname = scan.nextLine();
		
		System.out.println("Ciao! Immetti il tuo colore preferito...");
		Utente1.color = scan.nextLine();

		System.out.println("inserisci il tuo giorno di nascita...");
		Utente1.day = scan.nextInt();

		System.out.println("inserisci il tuo mese di nascita...");
		Utente1.month = scan.nextInt();

		System.out.println("inserisci il tuo anno di nascita...");
		Utente1.year = scan.nextInt();
		
		PasswordGenerator.generaPassword();
		
	}

}
