package day2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot cheezit = new Robot();
		
		// 5. Set your robot's pen to the down position
		cheezit.penDown();
		// 3. Set the robot to go at max speed (10)
		cheezit.move(10);
		// 4. Do the following (steps 6-8) 75 times
		
			// 7. Change the pen color to random
		
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
			
			// 2. Turn the robot 1/7 of 360 degrees to the right
		cheezit.turn(360/7);
			// 8. Set the pen width to i
			
			
	}
}
