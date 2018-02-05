
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	private static final Color Color = null;

	public static void main(String[] args) {
		
		
		 //1. make the robot draw a shape (this will take more than one line of code)
		Robot Ruhanika= new Robot();
  Ruhanika.setSpeed(30); 
  Ruhanika.setPenColor(255, 0, 157);
  Ruhanika.penDown();
  
 Ruhanika.move(100);
 Ruhanika.turn(90);
 Ruhanika.move(100);
 Ruhanika.turn(90);
 Ruhanika.move(100);
 Ruhanika.turn(90);
 Ruhanika.move(100);
		 //2. set the pen width to 10
	Ruhanika.setPenWidth(10);	
		//3. ask the user what color they would like the robot to draw
String Ruhi=		JOptionPane.showInputDialog("What color would you like the robot to draw?");
		
		//4. use an if/else statement to set the pen color that the user requested
	if (Ruhi.equals("yellow"))   {      
	Ruhanika	.setPenColor(255, 250, 0);  }
	Ruhanika.move(100);	
	 Ruhanika.turn(90);
	 Ruhanika.move(100);
	 Ruhanika.turn(90);
	