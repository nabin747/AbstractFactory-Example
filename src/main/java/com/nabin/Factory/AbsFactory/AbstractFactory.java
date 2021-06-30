package com.nabin.Factory.AbsFactory;

import com.nabin.Factory.AbsFactory.Colors.Color;
import com.nabin.Factory.AbsFactory.Shapes.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
