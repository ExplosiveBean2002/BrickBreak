//Adam Walker
//12/9/2025
//creates ball, allows ball to move, allows modification to balls movement and position of ball

package com.BrickBreak;
import java.awt.*;

public class Ball{
	//your code here!
	
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int rad;

	private int changeX;
	private int changeY;
	
	//constructor(s):
	public Ball(int x, int y, int rad){
		this.x = x;
		this.y = y;
		this.rad = rad;
	}
	//methods:
	public void draw(Graphics g){
		g.setColor(Color.white);
		g.fillOval(x, y, rad, rad);
	}
	public void move(){
		x += changeX;
		y += changeY;
	}
	public void reverseX(){
		changeX *= - 1;
	}
	public void reverseY(){
		changeY *= -1;
	}
	public int getXpos(){
		return x;
	}
	public int getYpos(){
		return y;
	}
	public int getSize(){
		return rad;
	}
	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}
	public void setXVelocity (int changeX){
		this.changeX = changeX;
	}
	public void setYVelocity (int changeY){
		this.changeY = changeY;
	}
	
	
}
