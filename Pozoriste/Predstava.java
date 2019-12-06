package Pozoriste;

/*Predstava je opisana nazivom, pozoristem u kojem se izvodi 
i sadrzi zaposlene koji ucestvuju u realizaciji predstave. 
Zaposleni za realizaciju predstave mogu da se dodaju i izbace. 
Moze da se dohvati broj zaposlenih na predstavi.
Sastavlja se tekstualni opis predstave navodeci naziv predstave 
i naziv pozorista u kojem se predstava odrzava razdvojene zarezom, 
a potom zaposlene koji ucestvuju u realizaciji predstave (svakog zaposlenog u zasebnom redu).
*/

import java.util.ArrayList;
import java.util.List;

public class Predstava {
	private String naziv;
	private Pozoriste pozoriste;
	private List<Zaposleni> zaposleni;

	public String getNaziv() {
		return naziv;
	}

	public Predstava(String naziv, Pozoriste pozoriste) {
		super();
		this.naziv = naziv;
		this.pozoriste = pozoriste;
		this.zaposleni = new ArrayList();
	}

	public boolean addZaposleni(Zaposleni z) {
		int brojac = 0;
		if (zaposleni.size() == 0) {
			zaposleni.add(z);
			System.out.println("Zaposleni " + z.getImePrezime() + " ce ucestvovati u predstavi.");
			return true;
		}
		for (int i = 0; i < zaposleni.size(); i++) {
			if (zaposleni.get(i) != z) {
				brojac++;
				if (brojac == zaposleni.size()) {
					zaposleni.add(z);
					System.out.println("Zaposleni " + z.getImePrezime() + " ce ucestvovati u predstavi.");
					return true;
				}
			}
		}
		System.out.println("Zaposleni " + z.getImePrezime() + " je vec u predstavi.");
		return false;
	}

	public boolean removeZaposleni(Zaposleni z) {
		if (zaposleni.size() == 0) {
			System.out.println("Zaposleni " + z.getImePrezime() + " nije deo predstave.");
			return false;
		}
		for (int i = 0; i < zaposleni.size(); i++) {
			if (zaposleni.get(i) == z)
				;
			zaposleni.remove(i);
			System.out.println("Zaposleni " + z.getImePrezime() + " je izbacen iz predstave.");
			return true;
		}
		System.out.println("Zaposleni " + z.getImePrezime() + " nije deo predstave.");
		return false;
	}

	public int brojZaposlenih() {
		return zaposleni.size();
	}

	public String toString() {
		String s = this.naziv + "," + this.pozoriste.getNaziv() + ":\n";
		int brojac = 0;
		if (zaposleni.size() == 0) {
			return s + "Nema nijednog zaposlenog u predstavi.";
		}
		for (int i = 0; i < zaposleni.size(); i++) {
			s += zaposleni.get(i).getImePrezime();
			brojac++;
			if (brojac < zaposleni.size()) {
				s += "\n";
			}
		}
		return s;
	}
}

