package Biblioteka2;

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
	
	public Knjiga(){
		
	}
	
	public Knjiga(int brojKnjige, String imeKnjige, boolean statusKnjigeDaLiJeKnigaIzdataIliNe){
		
		this.brojKnjige = brojKnjige;
		this.imeKnjige = imeKnjige;
		this.statusKnjigeDaLiJeKnjigaIzdataIliNe = statusKnjigeDaLiJeKnigaIzdataIliNe;
		
		knjigaArrayLista.add(this);
		
	}
	
	public static boolean daLiPostojiVecKnjigaSaIstimIDom (int brojKnjige){
		for (int i = 0; i < knjigaArrayLista.size(); i++){
			if (knjigaArrayLista.get(i).brojKnjige == brojKnjige){
				return true;
			}
		}
		return false;
	}
	
}
