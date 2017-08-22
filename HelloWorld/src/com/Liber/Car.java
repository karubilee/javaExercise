package com.Liber;

public class Car {
	public int color;
	private int speed;
	private Engine engine;
	
	public Car() {
		
	}
	
	public Car(int color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	public Car(int color,int speed, Engine engine) {
		this.color = color;
		this.speed = speed;
		this.engine = engine;
	}
	
	void startup() {
		System.out.println("Startup!");
	}
	
	void run() {
		startup();
		System.out.println("start,speed: " + speed);
	}
}
