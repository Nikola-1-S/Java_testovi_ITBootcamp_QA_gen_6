package Pozoriste;

/*Reditelj je zaposleni koji je prepoznatljiv po svom nadimku. 
Tekstualni oblik je nadimak_ime[naziv_pozorista].*/

public class Reditelj extends Zaposleni {
	private String nadimak;

	public Reditelj(String imePrezime, Pozoriste pozoriste, String nadimak) {
		super(imePrezime, pozoriste);
		this.nadimak = nadimak;
	}

	public String toString() {
		return nadimak + "_" + super.getImePrezime() + "[" + super.getPozoriste().getNaziv() + "]";
	}
}
