package Biblioteka2;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Knjiga {

	public int brojKnjige;
	public String imeKnjige;
	public boolean statusKnjigeDaLiJeKnjigaIzdataIliNe;

	public int getBrojKnjige() {
		return brojKnjige;
	}

	public void setBrojKnjige(int brojKnjige) {
		this.brojKnjige = brojKnjige;
	}

	public String getImeKnjige() {
		return imeKnjige;
	}

	public void setImeKnjige(String imeKnjige) {
		this.imeKnjige = imeKnjige;
	}

	public boolean isStatusKnjigeDaLiJeKnjigaIzdataIliNe() {
		return statusKnjigeDaLiJeKnjigaIzdataIliNe;
	}

	public void setStatusKnjigeDaLiJeKnjigaIzdataIliNe(
			boolean statusKnjigeDaLiJeKnjigaIzdataIliNe) {
		this.statusKnjigeDaLiJeKnjigaIzdataIliNe = statusKnjigeDaLiJeKnjigaIzdataIliNe;
	}

	public static ArrayList<Knjiga> knjigaArrayLista = new ArrayList<>();

	public Knjiga() {

	}

	public Knjiga(int brojKnjige, String imeKnjige,
			boolean statusKnjigeDaLiJeKnigaIzdataIliNe) {

		this.brojKnjige = brojKnjige;
		this.imeKnjige = imeKnjige;
		this.statusKnjigeDaLiJeKnjigaIzdataIliNe = statusKnjigeDaLiJeKnigaIzdataIliNe;

		knjigaArrayLista.add(this);

	}

	public static boolean daLiPostojiVecKnjigaSaIstimIDom(int brojKnjige) {
		for (int i = 0; i < knjigaArrayLista.size(); i++) {
			if (knjigaArrayLista.get(i).brojKnjige == brojKnjige) {
				return true;
			}
		}
		return false;
	}

	public static Knjiga getKnjiga(int brojKnjige) {

		for (int i = 0; i < knjigaArrayLista.size(); i++) {
			if (knjigaArrayLista.get(i).brojKnjige == brojKnjige)
				return knjigaArrayLista.get(i);
		}

		return null;
	}

	public static void podizanjeKnjige(int brojRacuna, int brojKnjige,
			Date datumPodizanja) throws IOException {

		DateFormat noviDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String datumPodizanjaKnjige = noviDateFormat.format(datumPodizanja);

		if (Validacija.validacijaZaPodizanjeKnjige(brojRacuna, brojKnjige)) {

			Knjiga.getKnjiga(brojKnjige).statusKnjigeDaLiJeKnjigaIzdataIliNe = true;
			Racun.getRacun(brojRacuna).setBrojPosudjenihKnjiga(
					Racun.getRacun(brojRacuna).brojPosudjenihKnjiga + 1);
			System.out.println("Knjiga je podignuta!");
			System.out.println();

			Zapisnik.podizanjeKnjige(brojKnjige,
					Knjiga.getKnjiga(brojKnjige).imeKnjige, brojRacuna, Racun
							.getRacun(brojRacuna).getImeMusterije(),
					datumPodizanjaKnjige);
		}
	}

	public static void vracanjeKnjige(int brojRacuna, int brojKnjige,
			Date datumVracanja) throws IOException {

		DateFormat noviDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String datumVracanjaKnjige = noviDateFormat.format(datumVracanja);

		if (Validacija.validacijaZaVracanjeKnjige(brojRacuna, brojKnjige)) {

			Knjiga.getKnjiga(brojKnjige).statusKnjigeDaLiJeKnjigaIzdataIliNe = false;
			Racun.getRacun(brojRacuna).setBrojPosudjenihKnjiga(
					Racun.getRacun(brojRacuna).brojPosudjenihKnjiga - 1);
			System.out.println("Knjiga je vracena!");
			System.out.println();

			Zapisnik.vracanjeKnjige(brojKnjige,
					Knjiga.getKnjiga(brojKnjige).imeKnjige, brojRacuna, Racun
							.getRacun(brojRacuna).getImeMusterije(),
					datumVracanjaKnjige);

		}
	}
	
	public void Date(){
	}

}
