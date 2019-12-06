package Autobus;

public class Vozac extends Covek {
	
	//Vozac je covek koji poseduje i zvanje (zanimanje -> sofer)
	
	private String zanimanje;

	//kada je nasledjena klasa onda ide konstruktor superclasa...
	public Vozac(String ime, String prezime, String sofer) {
		super(ime, prezime, sofer);
		this.zanimanje = sofer;
	}
		@Override
		public String toString() {
			return "Vozac [ime: "+super.getIme()+", prezime: "+super.getPrezime()+", id: "+super.getID()+", zanimanje: " + zanimanje + "]";
	
	}
	
	

}
