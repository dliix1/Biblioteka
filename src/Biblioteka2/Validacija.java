package Biblioteka2;

import java.io.IOException;

public class Validacija {

	public static boolean validacijaZaKreacijuRacuna(int id) throws IOException {

		for (int i = 0; i < Racun.racunArrayLista.size(); i++) {
			if (Racun.racunArrayLista.get(i).brojRacuna == id) {
				return true;
			}
		}
		return false;

	}

	public static boolean validacijaZaKreiranjeKnjige(int brojKnjige)
			throws IOException {

		for (int i = 0; i < Knjiga.knjigaArrayLista.size(); i++) {
			if (Knjiga.knjigaArrayLista.get(i).brojKnjige == brojKnjige) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean validacijaZaPodizanjeKnjige(int brojRacuna, int brojKnjige) throws IOException{
		
		
		Racun trenutniRacun = Racun.getRacun(brojRacuna);
		
		if (trenutniRacun == null){
			System.out.println("Nepostojeci racun!");
			return false;
		}
		
		Knjiga trenutnaKnjiga = Knjiga.getKnjiga(brojKnjige);
		
		if (trenutnaKnjiga == null){
			System.out.println("Nepostojeca knjiga!");
			return false;
		}
		
		if (trenutniRacun.getBrojPosudjenihKnjiga() >= 3){
			System.out.println("Unijeti racun ima tri ili vise podignutih knjiga!");
			return false;
		}
		
		if (trenutnaKnjiga.statusKnjigeDaLiJeKnjigaIzdataIliNe){
			System.out.println("Trazena broj knjige je podignut!");
			return false;
		}
		
		return true;
		
	}
	
	

}