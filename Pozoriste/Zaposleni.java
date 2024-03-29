package Pozoriste;

/*Zaposleni u pozoristu je opisan imenom (i prezimenom, jedno polje) 
i pozoristem u kojem je zaposlen. Svi podaci mogu da se dohvate. 
Moze da se sastavi tekstualni opis u obliku ime[naziv_pozorista].*/



public class Zaposleni {
	private String imePrezime;
	private Pozoriste pozoriste;

	public String getImePrezime() {
		return imePrezime;
	}

	public Pozoriste getPozoriste() {
		return pozoriste;
	}

	public Zaposleni(String imePrezime, Pozoriste pozoriste) {
		super();
		this.imePrezime = imePrezime;
		this.pozoriste = pozoriste;
	}

	public String toString() {
		return imePrezime + pozoriste.getNaziv() ;
	}
}
