package com.drawingapp.module;

import com.drawingapp.annotations.Circle;
import com.drawingapp.services.DrawCircle;
import com.drawingapp.services.DrawShape;
import com.google.inject.AbstractModule;

public class AppModule2 extends AbstractModule {

	@Override
	protected void configure() {
//		bind(DrawShape.class).annotatedWith(Circle.class).to(DrawCircle.class);
	}
}
