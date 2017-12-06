package day2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot cheezit = new Robot();
	cheezit.setSpeed(100);
	cheezit.move(250);	
	cheezit.turn(-180);
	cheezit.penDown();
	cheezit.setPenWidth(10);
	cheezit.setPenColor(Color.cyan);
	cheezit.sparkle();
	cheezit.miniaturize();
	
	for(int i = 0; i <4; i++) {
		
	

		
	}
}
}