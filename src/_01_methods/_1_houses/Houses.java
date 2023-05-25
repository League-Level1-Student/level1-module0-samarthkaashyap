package _01_methods._1_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	Robot rob = new Robot();

	public void run() {
		// Check the recipe to find out what code to put here
		rob.setX(10);
		rob.setY(450);
		rob.penDown();
		rob.setSpeed(20);
		draw_house("small", Color.BLUE);
		draw_house("medium", Color.RED);
		draw_house("large", Color.CYAN);
		draw_house("large", Color.MAGENTA);

	}
	void draw_house(String house, Color color) {
		int i = 0;
		if (house.equals("small")) {
			i = 60;
				draw_Pointy_Roof(i, color);
			
		}
		if (house.equals("medium")) {
			i = 120;

				draw_Pointy_Roof(i, color);
			
		}
		if (house.equals("large")) {
			i=250;
			draw_flat_house(i, color);
			}
		}
	

	void draw_flat_house(int i, Color color) {
	rob.setPenColor(color);
	rob.move(i);
	rob.turn(90);
	rob.move(40);
	rob.turn(90);
	rob.move(i);
	rob.turn(-90);
	rob.setPenColor(Color.GREEN);
	rob.move(30);
	rob.turn(-90);
	}
	void draw_Pointy_Roof(int i, Color color) {
		rob.setPenColor(color);
		rob.move(i);
		rob.turn(60);
		rob.move(20);
		rob.turn(60);
		rob.move(20);
		rob.turn(60);
		rob.move(i);
		rob.turn(-90);
		rob.setPenColor(Color.GREEN);
		rob.move(30);
		rob.turn(-90);
	}
}
