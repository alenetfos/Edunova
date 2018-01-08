package Edunova;

public class brojevi {
	
	public static void main(String[] args) {
		
		int[] niz = new int[24];
		int sum=0;
		
		niz[0]=2; niz[1]=259; niz[2]=184; niz[3]=54; niz[4]=76;
		niz[5]=78; niz[6]=23; niz[7]=45; niz[8]=98; niz[9]=432;
		niz[10]=54; niz[11]=76; niz[12]=89; niz[13]=235;
		niz[14]=56; niz[15]=12; niz[16]=14; niz[17]=21;
		niz[18]=27; niz[19]=36; niz[20]=43; niz[21]=96;
		niz[22]=58; niz[23]=61;

		for (int i : niz) {
		    sum += i;
		}
		System.out.print("Suma unesenih brojeva je: ");
		System.out.println(sum);
		
		int najveci = niz[0];
	    for (int i = 1; i < niz.length; i++) {
	        if (niz[i] > najveci) {
	            najveci = niz[i];
	        }
	    }
	    System.out.print("Najveci uneseni broj je: ");
	    System.out.println(najveci);

	    int najmanji = niz[0];
	    for (int i = 1; i < niz.length; i++) {
	        if (niz[i] < najmanji) {
	            najmanji = niz[i];
	        }
	    }
	    System.out.print("Najmanji uneseni broj je: ");    
	    System.out.println(najmanji);    
	}
}
