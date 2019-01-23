package guessingGame;

import javax.swing.JOptionPane;

public class guessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first_name;
		first_name = JOptionPane.showInputDialog("First Name");
		//System.out.println (welcome_message);
		String welcome_message;
		welcome_message = "welcome" + first_name + "try to guess my number, it is between 1 and 10";
		JOptionPane.showInputDialog(welcome_message);
	}

}
