package Edunova;

import javax.swing.JOptionPane;

public class Switch {

	public static void main(String[] args) {

		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi a: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi b: "));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Unesi c: "));

		int D = (b * b) - 4 * a * c;
		System.out.println(D);

		int i = Integer.parseInt(JOptionPane.showInputDialog("D>0 (1)  D<0 (2)  D=0 (3)"));
		switch (i) {
		case 1:
			System.out.println("Kvadratna funkcija ima dva realna rješenja x1 i x2");
			break;
		case 2:
			System.out.println("Kvadratna funkcija ima dva konjugirano kompleksna rješenja");
			break;
		case 3:
			System.out.println("Kvadratna funkcija ima samo jedno realno rješenje");
			break;
		default:
			System.out.println("Pogrešan unos!");
		}
	}

}
