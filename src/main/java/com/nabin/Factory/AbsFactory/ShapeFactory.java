package com.nabin.Factory.AbsFactory;

import com.nabin.Factory.AbsFactory.Colors.Blue;
import com.nabin.Factory.AbsFactory.Colors.Color;
import com.nabin.Factory.AbsFactory.Colors.Green;
import com.nabin.Factory.AbsFactory.Colors.Red;
import com.nabin.Factory.AbsFactory.Shapes.Circle;
import com.nabin.Factory.AbsFactory.Shapes.Rect;
import com.nabin.Factory.AbsFactory.Shapes.Shape;
import com.nabin.Factory.AbsFactory.Shapes.Square;

public class ShapeFactory extends AbstractFactory{
    @Override
   public Color getColor(String Color) {
            return null;
        }


    @Override
    public Shape getShape(String shape) {

            switch (shape){
                case "Circle":
                    return new Circle();
                case "Rectangle":
                    return new Rect();
                case "Square":
                    return new Square();
                default:
                    return null;
            }
        }
    }
