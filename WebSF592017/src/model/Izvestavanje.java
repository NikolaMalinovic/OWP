package model;

public class Izvestavanje {

	private String nazivFilma;
	private int brojProdukcija;
	private int brojProdatihKarata;
	private int ukupnaCena;
	
	public Izvestavanje(String nazivFilma, int brojProdukcija, int brojProdatihKarata, int ukupnaCena) {
		super();
		this.nazivFilma = nazivFilma;
		this.brojProdukcija = brojProdukcija;
		this.brojProdatihKarata = brojProdatihKarata;
		this.ukupnaCena = ukupnaCena;
	}

	public String getNazivFilma() {
		return nazivFilma;
	}

	public void setNazivFilma(String nazivFilma) {
		this.nazivFilma = nazivFilma;
	}

	public int getBrojProdukcija() {
		return brojProdukcija;
	}

	public void setBrojProdukcija(int brojProdukcija) {
		this.brojProdukcija = brojProdukcija;
	}

	public int getBrojProdatihKarata() {
		return brojProdatihKarata;
	}

	public void setBrojProdatihKarata(int brojProdatihKarata) {
		this.brojProdatihKarata = brojProdatihKarata;
	}

	public int getUkupnaCena() {
		return ukupnaCena;
	}

	public void setUkupnaCena(int ukupnaCena) {
		this.ukupnaCena = ukupnaCena;
	}
	
	
	
	
}
