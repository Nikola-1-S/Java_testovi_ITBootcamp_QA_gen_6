package Pozoriste;

/*Glumac je zaposleni koji ima i naziv uloge. Tekstualni oblik je uloga_ime[naziv_pozorista].*/


public class Glumac extends Zaposleni {
	private String nazivUloge;

	public Glumac(String imePrezime, Pozoriste pozoriste, String nazivUloge) {
		super(imePrezime, pozoriste);
		this.nazivUloge = nazivUloge;
	}

	public String toString() {
		return nazivUloge + "_" + super.getImePrezime() + "[" + super.getPozoriste().getNaziv() + "]";
	}
}

