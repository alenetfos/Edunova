package Edunova;

import javax.swing.JOptionPane;

public class Kalkulator_Vrijeme {
	
	public static void main(String[] args) {
	
		
		int broj_minuta = Integer.parseInt( JOptionPane.showInputDialog("Unesi broj minuta") );
		int broj_sati = Integer.parseInt( JOptionPane.showInputDialog("Unesi broj sati") );
		
		int broj_sekunda = (broj_minuta * 60) + (broj_sati*3600);
		
		System.out.println(broj_sekunda);
		
		
	}

}
