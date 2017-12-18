package Edunova;

import javax.swing.JOptionPane;

public class Pravokutnik {
	
	public static void main(String[] args) {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi stranicu a"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi stranicu b"));
		
		int o = (2*a) + (2*b);
		int p = (a*b);
		
		System.out.print("Opseg je: ");
		System.out.println(o);
		
		System.out.print("Povrsina je: ");
		System.out.println(p);
		
		
	}

}
