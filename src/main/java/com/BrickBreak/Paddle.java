//Adam Walker
//Date inside Ball.java
//Creates a paddle, makes paddle move, and allows changes to paddle movement and position of paddle

package com.BrickBreak;
import java.awt.Graphics;
import java.awt.*;

public class Paddle {


	//your code here!


	
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int height;
	private int width;
	private int velocity;

	//constructor(s):
	public Paddle(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	//methods:
	public void draw(Graphics g){
		g.setColor(Color.white);
		g.fillRect(x, y, width, height);
	}
	public void move(){
		x += velocity;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public int getHeight(){
		return height;
	}
	public int getWidth(){
		return width;
	}
	public int getVelocity(){
		return velocity;
	}
	public void setX(int x){
		this.x = x;
	}
	public void setVelocity(int velocity){
		this.velocity = velocity;
	}
	public void addVelocity(int velocity){
		x += velocity;
	}
}
