package Biblioteka2;

public class Zapisnik {

	public static String zapisnik = "";

	public void kreacijaRacuna(int brojRacuna, String musterija) {

		zapisnik += "Kreacija racuna: " + brojRacuna + " " + musterija;

	}

	public void kreacijaKnjige(int brojKnjige, String imeKnjige) {

		zapisnik += "Kreacija knjige: " + brojKnjige + " " + imeKnjige;

	}

	public static void podizanjeKnjige(int brojKnjige, String imeKnjige,
			int brojRacuna, String musterija, String datumPodizanja) {

		zapisnik += "--- Podizanje knjige --- " + brojKnjige + imeKnjige
				+ "--- Racun --- " + brojRacuna + musterija
				+ "--- Datum podizanja ---" + datumPodizanja;

	}

	public static void vracanjeKnjige(int brojKnjige, String imeKnjige,
			int brojRacuna, String musterija, String datumVracanja) {

		zapisnik += "--- Vracanje knjige ---" + brojKnjige + imeKnjige
				+ "--- Racun ---" + brojKnjige + musterija
				+ "--- Datum vracanja ---" + datumVracanja;

	}

	public static String ispisi() {
		return zapisnik;
	}

}
