package com.drawingapp.module;

import com.drawingapp.annotations.*;
import com.drawingapp.providers.*;
import com.drawingapp.request.SquareRequest;
import com.drawingapp.services.*;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Scopes;
import com.google.inject.Singleton;
import com.google.inject.multibindings.Multibinder;
import com.google.inject.name.Names;

public class AppModule1 extends AbstractModule {

	@Override
	protected void configure() {
		install(new AppModule2());
//		bind(DrawShape.class).to(DrawSquare.class).in(Scopes.SINGLETON);
//		bind(String.class).annotatedWith(Colorvalue.class).toInstance("Red");
//		bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(10);
//		bind(SquareRequest.class).in(Scopes.SINGLETON);
//		bind(DrawShape.class).annotatedWith(Square.class).to(DrawSquare.class);
		
//		bind(DrawShape.class).annotatedWith(Names.named("Square")).to(DrawSquare.class);
//		bind(DrawShape.class).annotatedWith(Names.named("Circle")).to(DrawCircle.class);
		
//		bind(DrawShape.class).to(DrawSquare.class);
//		bind(DrawShape.class).toProvider(DrawSquareProvider.class).in(Scopes.SINGLETON);
		
//		bind(DrawShape.class).annotatedWith(Square.class).toProvider(DrawSquareProvider.class).in(Scopes.SINGLETON);
//		bind(DrawShape.class).annotatedWith(Circle.class).toProvider(DrawCircleProvider.class).in(Scopes.SINGLETON);
		
		Multibinder<DrawShape> binder = Multibinder.newSetBinder(binder(), DrawShape.class);
		binder.addBinding().to(DrawSquare.class);
		binder.addBinding().to(DrawCircle.class);
	}
	
//	@Provides
//	@Singleton
//	@Square
//	DrawShape getDrawSquareObject(@Colorvalue String color, @EdgeValue Integer edge) {
//		DrawShape d = new DrawSquare(color, edge);
//		
//		return d;
//	}
	
//	@Provides
//	@Singleton
//	@Circle
//	DrawShape getDrawCircleObject(@Colorvalue String color, @EdgeValue Integer radius) {
//		DrawShape d = new DrawCircle(color, radius);
//		
//		return d;
//	}
	
}
