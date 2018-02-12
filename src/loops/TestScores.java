package loops;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	// 1. Write code to ask the user what their test score is and give different messages accordingly.
String Ruhanika = JOptionPane.showInputDialog("What is your test score?");
int Ruhi = Integer.parseInt(Ruhanika);
if( Ruhi== 10) { JOptionPane.showMessageDialog(null, "You did poorly!"); }
if( Ruhi== 20) { JOptionPane.showMessageDialog(null, "You did poorly!"); }
if( Ruhi== 30) { JOptionPane.showMessageDialog(null, "You did poorly!"); }
if( Ruhi== 40) { JOptionPane.showMessageDialog(null, "You did poorly!"); }
if( Ruhi== 50) { JOptionPane.showMessageDialog(null, "You did poorly!"); }
if( Ruhi== 60) { JOptionPane.showMessageDialog(null, "You did poorly!"); }
if( Ruhi== 70) { JOptionPane.showMessageDialog(null, "You did poorly!"); }
if( Ruhi== 80) { JOptionPane.showMessageDialog(null, "You did poorly!"); }
if( Ruhi== 90) { JOptionPane.showMessageDialog(null, "So Close!"); }
if( Ruhi== 100) { JOptionPane.showMessageDialog(null, "You are AMAZING!"); }



	
}
}
