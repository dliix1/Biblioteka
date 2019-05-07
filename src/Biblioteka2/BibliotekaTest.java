package Biblioteka2;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class BibliotekaTest {

	public static Scanner unos = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		menu();

	}

	public static void menu() throws IOException {
		System.out.println(" --- BIBLIOTEKA APP ---");
		System.out.println("Odaberite akciju: ");
		System.out.println("1. Kreiranje racuna.");
		System.out.println("2. Kreiranje knjige.");
		System.out.println("3. Podizanje knjige na odredjeni vremenski period.");
		System.out.println("4. Vracanje knjige.");
		System.out.println("5. Ispis detalja postojeceg racuna.");
		System.out.println("6. Ispis detalja zapisnika.");

		int korisnikovUnos = unosIntegera();

		switch (korisnikovUnos) {
		case 1:
			kreiranjeRacuna();
			break;

		case 2:
			kreiranjeKnjige();
			break;

		case 3:
			podizanjeKnjige();
			break;

		case 4:
			vracanjeKnjige();
			break;
		case 5:
			ispisRacuna();
			break;
		case 6: 
			ispisZapisnika();
			break;

		}
	}

	public static void kreiranjeRacuna() throws IOException {

		System.out.println("Unesite broj racuna: ");
		int brojRacuna = unosIntegera();

		System.out.println("Unesite ime musterije: ");
		unos.next();

		String imeMusterije = unos.nextLine();

		int brojPodignutihKnjigaPrilikomKreacije = 0;

		Validacija.validacijaZaKreacijuRacuna(brojRacuna);

		new Racun(brojRacuna, imeMusterije,
				brojPodignutihKnjigaPrilikomKreacije);

		menu();

	}

	public static void kreiranjeKnjige() throws IOException {

		System.out.println("Unesite broj knjige: ");
		int brojKnjige = unosIntegera();

		System.out.println("Unesite ime knjige: ");
		unos.next();

		String imeKnjige = unos.nextLine();

		Validacija.validacijaZaKreiranjeKnjige(brojKnjige);

		new Knjiga(brojKnjige, imeKnjige, false);

		menu();

	}

	public static void podizanjeKnjige() throws IOException {

		System.out.println("Unesite vas broj racuna: ");
		int brojRacuna = unosIntegera();

		System.out.println("Unesite broj knjige: ");
		int brojKnjige = unosIntegera();

		Knjiga.podizanjeKnjige(brojRacuna, brojKnjige, new Date());

		menu();

	}

	public static void vracanjeKnjige() throws IOException {

		System.out.println("Unesite vas broj racuna: ");
		int brojRacuna = unosIntegera();

		System.out.println("Unesite broj knjige: ");
		int brojKnjige = unosIntegera();

		Knjiga.vracanjeKnjige(brojRacuna, brojKnjige, new Date());

		menu();

	}

	public static void ispisRacuna() throws IOException {

		System.out.println("Unesite broj racuna: ");
		int brojRacuna = unosIntegera();

		System.out.println(Racun.ispisRacuna(brojRacuna));
		
		menu();
	}
	
	public static void ispisZapisnika() throws IOException {
		
		System.out.println(Zapisnik.ispisi());
		
		menu();
		
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
