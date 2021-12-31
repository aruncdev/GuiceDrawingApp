package com.drawingapp.main;

import com.drawingapp.module.*;
import com.drawingapp.request.*;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceDriver {

	public static void main(String[] args) {
		
		RequestToMakeShape("Square");
		RequestToMakeShape("Circle");
	}
	
	public static void RequestToMakeShape(String requestedShape) {

//		Injector injector = Guice.createInjector(new AppModule1(), new AppModule2());
		Injector injector = Guice.createInjector(new AppModule1());
		ShapeRequest r = injector.getInstance(ShapeRequest.class);
		
		if(requestedShape.equals("Square")) {	
			r.makeRequest("SQUARE");
		} else if(requestedShape.equals("Circle")) {
			r.makeRequest("CIRCLE");
		}
	}
}
