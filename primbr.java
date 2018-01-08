package Edunova;

import javax.swing.JOptionPane;

public class primbr {
	
	public static void main(String[] args) {
		
		  int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		  int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
	      int i =0;
	      int num =0;
	      
	      String  prostiBrojevi = "";
	      
	      for (i = a; i <= b; i++)  	   
	      { 		 		  
	         int br=0; 		  
	         for(num =i; num>=1; num--)
	         {
		    if(i%num==0)
		    {
			br = br + 1;
		    }
		 }
		 if (br ==2)
		 {
		    prostiBrojevi = prostiBrojevi + i + " ";
		 }	
		 
	      }	
	      System.out.println("Prosti brojevi izmedu a i b su: ");
	      System.out.println(prostiBrojevi);
		
	}

}
