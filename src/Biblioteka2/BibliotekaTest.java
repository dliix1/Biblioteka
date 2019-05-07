package Biblioteka2;

import java.io.IOException;
import java.util.Scanner;

public class BibliotekaTest {

	public static Scanner unos = new Scanner(System.in);

	public static void menu() {
		System.out.println(" --- BIBLIOTEKA APP ---");
		System.out.println(" --- ZA KREIRANJE RACUNA PRITISNITE 1! ---");
		System.out.println(" --- ZA KREIRANJE KNJIGA PRITISNITE 2! ---");
		System.out
				.println(" --- ZA PODIZANJE KNJIGA NA ODREDJENI VREMENSKI PERIOD PRITISNITE 3! ---");
		System.out
				.println(" --- ZA ISPISIVANJE DETALJA POSTOJECEG RACUNA PRITISNITE 4! ---");
	}

	public static void kreiranjeRacuna() throws IOException {

		System.out.println("Unesite broj racuna: ");
		int brojRacuna = unosIntegera();
		
		System.out.println("Unesite ime musterije: ");
		String imeMusterije = unos.nextLine();
		
		int brojPodignutihKnjigaPrilikomKreacije = 0;
		
		Racun racun = new Racun (brojRacuna, imeMusterije, brojPodignutihKnjigaPrilikomKreacije);

	}
	
	public static void validacijaZaKreacijuRacuna() throws IOException {
		
		Racun racun = new Racun();
		
	}

	public static int unosIntegera() {

		int uneseniBroj = 0;

		while (true)
			try {
				uneseniBroj = unos.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("Unesite ispravan unos!");
				unos.nextLine();
				continue;
			}

		return uneseniBroj;

	}

}
