//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extras;

import javax.swing.JOptionPane;

public class BananaQuiz {

	public static void main(String[] args) {
		// 1. ask the user if they like bananas
		String Ban = JOptionPane.showInputDialog("Do you like bananas?");
		// 2. if they say no,

		if (Ban.equals("no")) {
			JOptionPane.showMessageDialog(null, "You are a crazy!!!");

		}

		// tell them they are crazy
		// and end quiz
		// 3. if they say yes
		// ask them what is their favorite hobby
		String Hob = JOptionPane.showInputDialog("what is your favorite hobby?");
		// show a pop up that says "<your hobby> is much better with bananas!"

		JOptionPane.showMessageDialog(null, Hob+  " is much better with bananas ");
		// 4. OPTIONAL: if they say something other than “yes” or “no”
		// show a pop up that says “You are bananas!”
		JOptionPane.showMessageDialog(null, "You are bananas!");
	}

}
