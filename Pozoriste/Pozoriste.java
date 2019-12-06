package Pozoriste;

	/*Pozoriste ima jednoznacan automatski generisan celobrojan identifikator 
	 * i naziv koji mogu da se dohvate. Moze da se sastavi tekstualni opis u obliku naziv[id].*/

	public class Pozoriste {
		private String naziv;
		private int iD;
		private static int globalId;

		public String getNaziv() {
			return naziv;
		}

		public int getiD() {
			return iD;
		}

		public Pozoriste(String naziv) {
			super();
			this.naziv = naziv;
			this.iD = globalId++;
		}

		public String toString() {
			return naziv + "[" + iD + "]";
		}
	}

