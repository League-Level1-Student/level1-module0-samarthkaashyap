package _01_methods._5_FlappyBird;

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
    	background(bg);
    	image(fb, x, y);
    	y = y-birdYVelocity;
    	birdYVelocity = birdYVelocity - gravity;
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
