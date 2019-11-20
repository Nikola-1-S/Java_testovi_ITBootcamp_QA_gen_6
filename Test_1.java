package Testovi;

import java.util.Scanner;

public class Test_1 {

	public static void main(String[] args) {
		/* Traziti od korisnika da unese pozitivan broj N. 
		Zatim ucitavati N brojeva sa standardnog ulaza i ispisati vrednost najmanjeg unetog broja.
        */
		
Scanner sc = new Scanner(System.in);
		
		System.out.print("Do broja n = ");
        int n=sc.nextInt();
        
        if (n <= 1) {
	    	System.out.print("Greska, unesite ponovo broj: ");
	    	
	    System.out.print("Unesite ponovo broj: ");
	    n = sc.nextInt();
        }
        System.out.print("br1=");
        int br=sc.nextInt();
        if (br <= 0) {
	    	System.out.print("Greska, unesite pozitivan broj: ");
	    	}
        
        int min=br;
        int i=2;
        
         
        while (i <= n){
            System.out.print("br"+i+ "=");
            int a = sc.nextInt();
            if (a < min) min = a;
            i++;
        }
        System.out.print("min=" + min);
		
	}

}
