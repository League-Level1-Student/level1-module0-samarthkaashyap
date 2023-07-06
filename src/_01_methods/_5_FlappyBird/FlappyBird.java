package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	background(0, 0, 100);
    	fill(255,255,0);
    	stroke(0, 0, 0);
    	ellipse(50, 300, 20, 20);
    }

    @Override
    public void draw() {
        
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
