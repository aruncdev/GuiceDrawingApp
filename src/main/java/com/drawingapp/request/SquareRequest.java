package com.drawingapp.request;

import com.drawingapp.annotations.Circle;
import com.drawingapp.annotations.Square;
import com.drawingapp.services.DrawShape;
import com.drawingapp.services.DrawSquare;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.name.Named;

public class SquareRequest {

//	@Inject
//	@Named("Square") DrawShape d;
	
//	@Inject
//	@Square DrawShape d;
	
	@Inject
	@Square DrawShape d;
	
//	@Inject
//	Provider<DrawSquare> d;
	
//	@Inject
//	public SquareRequest(@Square DrawShape d) {
//		this.d = d;
//	}
	
	public void makeRequest() {
//		DrawSquare d1 = d.get();
//		d1.draw();
		d.draw(); // A thread can be started only once. Second time it will throw an error.
	}
}
