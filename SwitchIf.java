package Edunova;

import javax.swing.JOptionPane;

public class SwitchIf {
	
	public static void main(String[] args) {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi stranicu a"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi stranicu b"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Unesi stranicu c"));
		double o1=a+b+c;

		if ((a + b) > c && (b + c) > a && (c + a) > b) {
			System.out.println("Trokut je moguc");
			int i = Integer.parseInt(JOptionPane.showInputDialog("Pravokutan (1) Jednakostranièan(2) Raznostranièan(3)"));
			switch (i) {
			case 1:
				double p1=(a*b)/2;
				System.out.print("Povrsina trokuta iznosi:");
				System.out.println(p1);
				System.out.print("Opseg iznosi");
				System.out.println(o1);
				break;
			case 2:
				int v1 = Integer.parseInt(JOptionPane.showInputDialog("Unesi visinu"));
				double p2= (a*v1)/2;
				System.out.print("Povrsina trokuta iznosi:");
				System.out.println(p2);
				System.out.print("Opseg iznosi");
				System.out.println(o1);
				break;
			case 3:
				int v2 = Integer.parseInt(JOptionPane.showInputDialog("Unesi visinu"));
				double p3= (a*v2)/2;
				System.out.print("Povrsina trokuta iznosi:");
				System.out.println(p3);
				System.out.print("Opseg iznosi");
				System.out.println(o1);
				break;
			default:
				System.out.println("Pogrešan unos!");
			    
			}
		}
		else {
			System.out.println("Trokut nije moguc");
		}
	}

}
