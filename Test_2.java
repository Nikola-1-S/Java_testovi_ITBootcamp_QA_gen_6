package Testovi;

import java.util.Scanner;

public class Test_2 {

	public static void main(String[] args) {
		/* Ukoliko kupac kupi robu u iznosu vecem od 1500 dinara, dobija 10% popusta, 
		   a ukoliko kupi robu u iznosu vecem od 7000 dinara dobija 20% popusta. 
		   Napisati program koji ce za uneti iznos odabrane robe 
		   ispisati koliko zapravo treba platiti.
		 */
           
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Uneti iznos za placenu robu: ");
		
		
		double CenaSaPopustom; 
		double Vrednostrobe = sc.nextDouble();
		
		if (Vrednostrobe > 0) {
			 if (Vrednostrobe > 1500 && Vrednostrobe <= 7000) {
				 CenaSaPopustom = (Vrednostrobe - (Vrednostrobe * 0.1 ));
			 System.out.println("cena robe ce biti: " + CenaSaPopustom );	
		 }
		 
		 else if (Vrednostrobe > 7000) {
			 CenaSaPopustom = (Vrednostrobe - (Vrednostrobe * 0.2));
				  System.out.println("Cena robe ce biti: " + CenaSaPopustom); 
			  }
			  
		 else  {
					  System.out.println("Cena robe ce biti: " + Vrednostrobe);
					  
		 }	  
		}
			
	}
		
		  
	}		
	


