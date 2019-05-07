package Biblioteka2;

import java.io.IOException;

public class Validacija {

	public static boolean validacijaZaKreacijuRacuna(int id) throws IOException {

		for (int i = 0; i < Racun.racunArrayLista.size(); i++) {
			if (Racun.racunArrayLista.get(i).brojRacuna == id) {
				return true;
			}
		}
		System.out.println("Racun je uspjesno napravljen!");
		System.out.println();
		return false;

	}

	public static boolean validacijaZaKreiranjeKnjige(int brojKnjige)
			throws IOException {

		for (int i = 0; i < Knjiga.knjigaArrayLista.size(); i++) {
			if (Knjiga.knjigaArrayLista.get(i).brojKnjige == brojKnjige) {
				return true;
			}
		}
		System.out.println("Knjiga je uspjesno napravljena!");
		System.out.println();
		return false;
	}
	
	public static boolean validacijaZaPodizanjeKnjige(int brojRacuna, int brojKnjige) throws IOException{
		
		
		Racun racun = Racun.getRacun(brojRacuna);
		
		if (racun == null){
			System.out.println("Nepostojeci racun!");
			return false;
		}
		
		Knjiga knjiga = Knjiga.getKnjiga(brojKnjige);
		
		if (knjiga == null){
			System.out.println("Nepostojeca knjiga!");
			return false;
		}
		
		if (racun.getBrojPosudjenihKnjiga() >= 3){
			System.out.println("Unijeti racun ima tri ili vise podignutih knjiga!");
			return false;
		}
		
		if (knjiga.statusKnjigeDaLiJeKnjigaIzdataIliNe){
			System.out.println("Trazena broj knjige je podignut!");
			return false;
		}
		
		return true;
		
	}
	
	public static boolean validacijaZaVracanjeKnjige(int brojRacuna, int brojKnjige) throws IOException {
		
		Racun racun = Racun.getRacun(brojRacuna);
		if (racun == null){
			System.out.println("Unijeti racun ne postoji!");
			return false;
		}
		
		Knjiga knjiga = Knjiga.getKnjiga(brojKnjige);
		if (knjiga == null){
			System.out.println("Unijeta knjiga ne postoji!");
			return false;
		}
		
		if (knjiga.statusKnjigeDaLiJeKnjigaIzdataIliNe){
			System.out.println("Unijeta knjiga nije na stanju ili je vec podignuta!");
			return false;
		}
		
		return true;
	}
	

}
