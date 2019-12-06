package Autobus;

public class Covek {
	
	/*Covek poseduje ime i prezime, i jedinstveni identifikacioni broj 
	  koji se dodeljuju prilikom kreiranja objekta. Svi podaci mogu da se dohvate, 
	  ali ne i postave */
	 
	private String ime;
	private String prezime;
	private String jmbg;
	public static int globalID = 1;
	private int ID;
	
	//konstruktor
	public Covek(String ime, String prezime, String jmbg) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		ID = globalID++;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public String getJmbg() {
		return jmbg;
	}

	public static int getGlobalID() {
		return globalID;
	}

	public int getID() {
		return ID;
	}
	
	


}
