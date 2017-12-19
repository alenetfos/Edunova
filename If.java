package Edunova;

import javax.swing.JOptionPane;

public class If {

	public static void main(String[] args) {

	int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi stranicu a: "));
	int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi stranicu b: "));
	int c = Integer.parseInt(JOptionPane.showInputDialog("Unesi stranicu c: "));

	if((a+b)>c&&(b+c)>a&&(c+a)>b){
		double p = ((a * b) / 2);
		double o = a + b + c;
		System.out.print("Trokut je moguæ i njegova povrsina iznosi: ");
		System.out.println(p);
		System.out.print("Opseg trokuta iznosi: ");
		System.out.println(o);
	}
	else{
		System.out.println("Trokut nije moguc unesite vrijednosti ponovo");
	}

}

}
