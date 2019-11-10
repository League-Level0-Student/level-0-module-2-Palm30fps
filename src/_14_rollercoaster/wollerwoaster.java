package _14_rollercoaster;

import javax.swing.JOptionPane;

public class wollerwoaster {
	public static void main(String[] args) {

		String Height = JOptionPane.showInputDialog("How tall are you in inches?");
		int i = Integer.parseInt(Height);
		if (i > 46) {
			JOptionPane.showMessageDialog(null, "you're allowed on enjoy the ride!");
		} else {
			JOptionPane.showMessageDialog(null, "Sorry you are not allowed on this ride!");
		}

	}
}