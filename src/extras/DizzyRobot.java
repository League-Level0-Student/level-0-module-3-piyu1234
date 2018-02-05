//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extras;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot robot = new Robot();

	public static void main(String[] args) {

		// 2. Ask the user how dizzy you want the robot from 1-10, then spin that number of times.
String Ishita = JOptionPane.showInputDialog(null, "How dizzy do you want the robot from 1-10?");
if (Ishita.equals("7"))   {    
	
	Ishita.move(100);
	if (Ishita.equals("1"))   { 
		if (Ishita.equals("8"))   {    
	}

		// 1. Use the dance method to make the robot spin.
		Robot Pihu = new Robot();
		int count = 15;
		dance(count);    }

	}
	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			robot.turn(360);
		}
	}
}
