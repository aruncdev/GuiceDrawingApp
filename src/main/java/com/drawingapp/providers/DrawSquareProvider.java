//package com.drawingapp.providers;
//
//import com.drawingapp.annotations.Colorvalue;
//import com.drawingapp.annotations.EdgeValue;
//import com.drawingapp.services.*;
//import com.google.inject.Inject;
//import com.google.inject.Provider;
//
//public class DrawSquareProvider implements Provider<DrawSquare> {
//	
//	String color;
//	Integer edgeSize;
//	
//	@Inject
//	public DrawSquareProvider(@Colorvalue String color, @EdgeValue int edge) {
//		this.color = color;
//		this.edgeSize = edge;
//	}
//
//	@Override
//	public DrawSquare get() {
//		DrawSquare d = new DrawSquare(color, edgeSize);
//		return d;
//	}
//
//}
