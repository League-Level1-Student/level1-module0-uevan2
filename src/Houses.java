import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	
	static Robot rob = new Robot();
	
	
	static void houseHeight(String height, String color, String roofType) {
		
		rob.setPenColor(8, 170, 8);
		rob.move(25);
		
		if(color.equals("red")) {
			rob.setPenColor(230, 10, 10);
		}
		else if(color.equals("orange")) {
			rob.setPenColor(225, 90, 5);
		}
		else if(color.equals("green")) {
			rob.setPenColor(10, 230, 10);
		}
		else if(color.equals("blue")) {
			rob.setPenColor(10, 10, 230);
		}
		else if(color.equals("purple")) {
			rob.setPenColor(170, 5, 225);
		}
		else if(color.equals("yellow")) {
			rob.setPenColor(225, 170, 5);
		}
		
		rob.turn(90);
		if(height.equals("small")) {
			rob.move(60);
		}
		else if(height.equals("medium")) {
			rob.move(120);
		}
		else if(height.equals("large"))	{
			rob.move(250);
		}
		else {
			rob.move(120);
		}
		if(roofType.equals("triangular")) {
			rob.turn(-45);
			rob.move(21);
			rob.turn(-90);
			rob.move(21);
			rob.turn(-45);
		}
		else if(roofType.equals("rectangular")){	
			rob.turn(-90);
			rob.move(30);
			rob.turn(-90);
		}
		if(height.equals("small")) {
			rob.move(60);
		}
		else if(height.equals("medium")) {
			rob.move(120);
		}
		else if(height.equals("large"))	{
			rob.move(250);
		}
		else {
			rob.move(120);
		}
		rob.turn(90);
		
	}
	
	public static void main(String[] args) {
		//start position
				rob.setX(800);
				rob.setY(500);
				//robot speed
				rob.setSpeed(10);
				//pen related code
				rob.penDown();
				rob.setPenColor(0,0,0);
				rob.setPenWidth(5);
				//this line is only needed once
				rob.turn(-90);
				
				houseHeight("small", "yellow", "rectangular");
				houseHeight("medium", "blue", "triangular");
				houseHeight("large", "green", "rectangular");
				houseHeight("medium", "red", "rectangular");
				houseHeight("small", "orange", "triangular");
				houseHeight("medium", "purple", "rectangular");
				houseHeight("small", "blue", "triangular");
				houseHeight("large", "yellow","rectangular" );
				houseHeight("medium", "orange", "rectangular");
				houseHeight("large", "red", "triangular");
				houseHeight("small", "green", "rectangular");
				houseHeight("large", "purple", "triangular");
	}
}

