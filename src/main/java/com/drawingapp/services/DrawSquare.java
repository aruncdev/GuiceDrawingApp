package com.drawingapp.services;

import com.drawingapp.annotations.Colorvalue;
import com.drawingapp.annotations.EdgeValue;
import com.google.inject.Inject;

public class DrawSquare implements DrawShape {

	private String color;
	private Integer edge;
//	Thread t = new Thread(() -> {
//		System.out.println("Drawing Square of color: " + color + " and a edge: " + edge);
//	});

//	@Inject
//	public DrawSquare(@Colorvalue String color, @EdgeValue Integer edge) {
//		this.color = color;
//		this.edge = edge;
//	}
	
	
	@Override
	public void draw() {
//		System.out.println("Drawing Square of color: " + color + " and a edge: " + edge);
		System.out.println("Drawing Square !!!");
//		t.start(); // A thread can be started only once. Second time it will throw an error.
	}

	@Override
	public String getName() {
		return "SQUARE";
	}
}
