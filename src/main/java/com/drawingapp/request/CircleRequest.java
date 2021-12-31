package com.drawingapp.request;

import com.drawingapp.annotations.Circle;
import com.drawingapp.services.DrawShape;
import com.google.inject.Inject;
import com.google.inject.name.Named;

public class CircleRequest {
 
//	@Inject
//	@Circle DrawShape d;
//	@Named("Circle") DrawShape d;
	
	@Inject
	@Circle DrawShape d;
	
	public void makeRequest() {
		d.draw();
	}
	
}
