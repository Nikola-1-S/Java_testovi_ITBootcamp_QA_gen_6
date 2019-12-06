package Autobus;

public class GlavniProgram {

	public static void main(String[] args) {
		
		/*Covek poseduje ime i prezime, i jedinstveni identifikacioni broj koji se 
		dodeljuju prilikom kreiranja objekta. Svi podaci mogu da se dohvate, ali ne i postave.
		
		Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).
		
		Putnik je covek koji poseduje novac. Inicijalno poseduje odredjenu kolicinu novca 
		koja mu se zadaje prilikom kreiranja. Odredjena svota novca moze da mu se doda i/ili oduzme, 
		gde je potrebno vratiti indikator uspesnosti.
		
		Autobus poseduje naziv, vozaca, cenu karte i niz putnika koji se njime voze. 
		Naziv, cena karte i broj mesta zadaju se prilikom kreiranja. 
		Moguce je dodati/ukloniti putnika kao i vozaca. 
		Moguce je naplatiti kartu putnicima samo ako je vozac prisutan. 
		Autobus ispisati u sledecem obliku:
		Naziv ( vozac - Putnik1[novac], Putnik2 [novac],... )*/
		
		//pravimo objekte
		
		Covek c1 = new Covek("Darko", "Orasic", "685625632");
		Covek c2 = new Covek("Miroslav","Cvetic","124237262");
		
		Vozac v1 = new Vozac("Adem", "Peric", "76162123");
		Vozac v2 = new Vozac("Dejan", "Zigic", "0393999123");
		
		Putnik p1 = new Putnik("Slavko","Milunovic", "42632686", 450);
		Putnik p2 = new Putnik("Marina","Zdravkoovic", "58263297", 750);
		
		Autobus a1 = new Autobus("Lasta", 220.50, 2);
		Autobus a2 = new Autobus("MAN", 300, 2);
		
		
		
		System.out.println("AUTOBUS BROJ 1");
		a1.dodajVozaca(v1);
		System.out.println(a1.getVozac());
		System.out.println(a1.dodajVozaca(v1));
		System.out.println(a1.getVozac());
		System.out.println(a1.ukloniVozaca());
		System.out.println(a1.getVozac());
		System.out.println(a1.dodajVozaca(v2));
		System.out.println(a1.getVozac());

		System.out.println("");
		System.out.println(a1.dodajPutnika(p1));
		System.out.println(a1.dodajPutnika(p2));
	

		System.out.println(a1.ukloniPutnika(p1));
		System.out.println(a1.dodajPutnika(p2));
		System.out.println("");
		a1.ispisiPutnici();

		a1.payTicket();
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		//pozivam metodu
		
				System.out.println(p1.getPosedujeNovac()+" " + p1.getIme()+" "+ p1.getPrezime() );
				
				//pozivam metodu za dodavanje novca
				System.out.println(p1.dodajNovac(-300));
				System.out.println(p1.getPosedujeNovac());
				p1.oduzmiNovac(150);
				System.out.println(p1.getPosedujeNovac());
				System.out.println(p1.dodajNovac(200)); //metoda sa ispisom
	}

}
