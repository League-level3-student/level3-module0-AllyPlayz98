package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		
	
		//2. create an array of 5 robots.
Robot[] robotArray = new Robot [5];
		//3. use a for loop to initialize the robots.
for (int i = 0; i < robotArray.length; i++) {
	robotArray[i] = new Robot();

			//4. make each robot start at the bottom of the screen, side by side, facing up
robotArray[i].setX(150*i);
robotArray[i].setY(500);
}
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
    	Random r = new Random();
    	boolean b = false;
    	while (b==false) {
    	for (int i = 0; i < robotArray.length; i++) {
			int g = r.nextInt(100);
			robotArray[i].move(g );
			if (robotArray[i].getY()<=0) {
				b = true;
			}
		}
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
    	
	
}
		//7. declare that robot the winner and throw it a party!
    	if (b = true) {
			System.out.println(robotArray[i] + "won!! congrats :)");
		}
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	}
}
