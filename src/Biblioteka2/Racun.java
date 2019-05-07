package Biblioteka2;

import java.util.ArrayList;

public class Racun {
	
	public int brojRacuna;
	public String imeMusterije;
	public int brojPosudjenihKnjiga;
	
	public int getBrojRacuna() {
		return brojRacuna;
	}
	public void setBrojRacuna(int brojRacuna) {
		this.brojRacuna = brojRacuna;
	}
	public String getImeMusterije() {
		return imeMusterije;
	}
	public void setImeMusterije(String imeMusterije) {
		this.imeMusterije = imeMusterije;
	}
	public int getBrojPosudjenihKnjiga() {
		return brojPosudjenihKnjiga;
	}
	public void setBrojPosudjenihKnjiga(int brojPosudjenihKnjiga) {
		this.brojPosudjenihKnjiga = brojPosudjenihKnjiga;
	}
	
	public static ArrayList<Racun> racunArrayLista = new ArrayList<>();
	
	public Racun(){
		
	}
	
	public Racun(int brojRacuna, String imeMusterije, int brojPosudjenihKnjiga){
		
		this.brojRacuna = brojRacuna;
		this.imeMusterije = imeMusterije;
		this.brojPosudjenihKnjiga = brojPosudjenihKnjiga;
		
		racunArrayLista.add(this);
		
	}
	
	public static boolean provjeraDaLiPostojiRacunSaIstimBrojem (int brojRacuna){
		for (int i = 0; i < racunArrayLista.size(); i++){
			if (racunArrayLista.get(i).brojRacuna == brojRacuna)
				return true;
		}
		return false;
	}
	
	
	

}
