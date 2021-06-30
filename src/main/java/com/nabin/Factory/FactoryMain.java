package com.nabin.Factory;

import com.nabin.Factory.AbsFactory.AbstractFactory;
import com.nabin.Factory.AbsFactory.Colors.Color;
import com.nabin.Factory.AbsFactory.ShapeFactory;
import com.nabin.Factory.AbsFactory.producer.FactoryProducer;
import com.nabin.Factory.AbsFactory.Shapes.Shape;

public class FactoryMain {
    public static void main(String[] args) {
      //  AbstractFactory ForShape = FactoryProducer.getFactory("Shape");
        //Shape shape1 = ShapeFactory.getShape("Circle");
        //shape1.draw();
//        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
//        Shape shape = shapeFactory.getShape("circle");
//        shape.draw();
        AbstractFactory takeFactory = FactoryProducer.getFactory("Color");
        Color factory1 = takeFactory.getColor("Red");
        factory1.fill();


    }
}
