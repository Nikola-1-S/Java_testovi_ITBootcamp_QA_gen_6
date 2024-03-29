package Predavanje;

import java.util.Scanner;

public class Zadatak_2_11222019 {

			/*Napisati program koji ucitava niz od n celih brojeva i dve metode. 
			 * Prva metoda vraca proizvod elemenata na neparnim pozicijama, 
			 * a druga vraca zbir parnih elemenata niza.*/
			
			// upisivanje elemenata u niz
				public static Double[] ucitajNiz(int duzina) {
					Double[] niz = new Double[duzina];
					Scanner sc = new Scanner(System.in);
					for (int i = 0; i < duzina; i++) {
						System.out.println("Unesi " + (i + 1) + ". clan niza");
						niz[i] = sc.nextDouble();
					}
					return niz;
				}

				
				
				
				// Ispisivanje unetog niza
				public static void ispisiNiz(Double[] niz) {
					System.out.println(""); // pravimo nov red da odvojimo ispis od unosa
					System.out.print("Ispisan niz: ");
					for (int i = 0; i < niz.length; i++) {
						System.out.print(niz[i] + "  ");
					}
				}
			
				
				
				
				
				
				// odredjivanje proizvoda clanova na neparnim pozicijama
				// Pozicije u nizu idu 1,2,3...
				// Indeksi u nizu idu  0,1,2...
				// Logika je da za parne pozicije, u ovom slucaju, vazi i%2==1
				// Ukratko, meni parna pozicija ima neparni indeks
				public static void proizvodNeparnih(Double[] niz) {
					Double proizvod = 1d;
					System.out.println("");
					System.out.print("Proizvod clanova na neparnim pozicijama je: ");
					for (int i = 0; i < niz.length; i++) {
						if ( i%2 == 0) {
							proizvod = proizvod * niz[i];
						}
					}
					System.out.print(proizvod);
				}
				
				
				
				
				
				// odredjivanje proizvoda clanova na neparnim pozicijama
				public static void zbirParnih(Double[] niz) {
					Double zbir=0d;
					System.out.println("");
					System.out.print("Zbir clanova na parnim pozicijama je: ");
					for (int i = 0; i < niz.length; i++) {
						if ( i%2 == 1) {
							zbir = zbir + niz[i];
						}
					}	
					System.out.print(zbir);
				}
				
				
				
				
				
				
			
			
			public static void main(String[] args) {
				// Napisati program koji ucitava niz od n celih brojeva i dve metode. 
				// Prva metoda vraca proizvod elemenata na neparnim pozicijama, 
				// a druga vraca zbir parnih elemenata niza.
				
				
				
				// Prvo definisemo duzinu niza
				Scanner sc = new Scanner(System.in);
				int duzina;
				do {
					System.out.print("Unesite pozitivnu, celobrojnu, duzinu niza: ");
					while (!sc.hasNextInt()) { System.out.print("To nije ocekivani rezultat, pokusajte ponovo: ");
						sc.next();
					}
					duzina = sc.nextInt();
					if (duzina == 0)System.out.print("Duzina niza ne moze biti 0. ");
					if (duzina < 0) System.out.print("Duzina ne moze biti negativna. ");
					if (duzina == 1) System.out.println("Nema smisla kreirati niz od jednog broja, ali OK, kako hoces");
				} while (duzina < 0);

				
				
				
				
				// Deklaracija niza i prosledjivanje duzine niza ka metodi
				Double[] niz = ucitajNiz(duzina);
				// kreiraj niz zvan "niz", i prosledi duzinu niza "duzinu" u metodu ucitajNiz

				
				
			
				
				// ispisivanje niza
				ispisiNiz(niz);

				
				
				
				
				// ispisujemo proizvod na neparnim
				proizvodNeparnih(niz);

				
				
				
				
				
				// ispisujemo proizvod na neparnim
				zbirParnih(niz);
		

	}

}
