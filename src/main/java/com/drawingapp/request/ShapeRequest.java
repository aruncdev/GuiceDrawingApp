package com.drawingapp.request;

import java.util.*;

import com.drawingapp.services.*;
import com.google.inject.Inject;

public class ShapeRequest {

	Map<String, DrawShape> shapeObjects = new HashMap<>();
	
	@Inject
	public ShapeRequest(Set<DrawShape> shapes) {
		for(DrawShape shape: shapes) {
			shapeObjects.put(shape.getName(), shape);
		}
	}
	
	public void makeRequest(String reqShape) {
		DrawShape d = shapeObjects.get(reqShape);
		
		d.draw();
	}
}
