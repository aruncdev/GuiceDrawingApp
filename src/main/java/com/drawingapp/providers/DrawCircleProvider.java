//package com.drawingapp.providers;
//
//import com.drawingapp.annotations.Colorvalue;
//import com.drawingapp.annotations.EdgeValue;
//import com.drawingapp.services.DrawCircle;
//import com.google.inject.Inject;
//import com.google.inject.Provider;
//
//public class DrawCircleProvider implements Provider<DrawCircle> {
//
//	String color;
//	Integer radius;
//	
//	@Inject
//	public DrawCircleProvider(@Colorvalue String color, @EdgeValue int radius) {
//		this.color = color;
//		this.radius = radius;
//	}
//	
//	@Override
//	public DrawCircle get() {
//		DrawCircle d = new DrawCircle(color, radius);
//		
//		return d;
//	}
//
//}
