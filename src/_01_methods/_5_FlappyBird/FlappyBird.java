package _01_methods._5_FlappyBird;

import java.util.Random;

import processing.core.PApplet;
import processing.core.PImage;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
PImage bg;
PImage fb;
int x = 70;
int y = 300;
int birdYVelocity = -3;
int gravity = 1;
int x2 = 800;
Random height2 = new Random();
int heightposition = height2.nextInt(600);
int gap = 250;
int score = 0;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	bg = loadImage("flappybird.jpeg");
    	bg.resize(800,600);
    	fb = loadImage("bird.png");
    	fb.resize(70, 70);
    	
    }
    public void mousePressed() {
    	birdYVelocity = 15;
    }

    @Override
    public void draw() {
    	if (x2 == 0) {
    		x2 = 800;
    		heightposition = height2.nextInt(300)+100;
    		score ++;
    	}
    	
    	background(bg);
    	text("Score: "+ score, 10,10);
    	image(fb, x, y);
    	fill(0, 255, 0);
    	rect(x2, 0, 100, heightposition);
    	rect(x2, heightposition+gap, 100, 700);
    	y = y-birdYVelocity;
    	birdYVelocity = birdYVelocity - gravity;
    	x2 -= 5;
    	if (intersectsPipes()) {
    		score = 0;
    	}
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
    boolean intersectsPipes() { 
        if (y < heightposition && x > x2 && x < (x2+100)){
           return true; }
       else if (y>heightposition+gap && x > x2 && x < (x2+100)) {
           return true; }
       else { return false; }
}
}
