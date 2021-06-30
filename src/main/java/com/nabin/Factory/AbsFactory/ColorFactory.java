package com.nabin.Factory.AbsFactory;

import com.nabin.Factory.AbsFactory.Colors.Blue;
import com.nabin.Factory.AbsFactory.Colors.Color;
import com.nabin.Factory.AbsFactory.Colors.Green;
import com.nabin.Factory.AbsFactory.Colors.Red;
import com.nabin.Factory.AbsFactory.Shapes.Shape;

public class ColorFactory extends AbstractFactory{
    @Override
   public Color getColor(String color) {

        switch (color) {
            case "Red":
                return new Red();
            case "Blue":
                return new Blue();
            case "Green":
                return new Green();
            default:
                return null;
        }
    }


    @Override
    public Shape getShape(String Shape) {
        return null;
    }
}
