
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
	
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
Robot Ruhanika= new Robot();
		// 2. Make the robot draw a star shape. Hint: 144.

int StarSize= 30;
Ruhanika.setSpeed(30);
Ruhanika.penDown();
Ruhanika.setPenColor(0, 203, 239);
Ruhanika.move(144);
Ruhanika.turn(144);
Ruhanika.move(144);
Ruhanika.turn(144);
Ruhanika.move(144);
Ruhanika.turn(144);
Ruhanika.move(144);
Ruhanika.turn(144);
Ruhanika.move(144);
		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
