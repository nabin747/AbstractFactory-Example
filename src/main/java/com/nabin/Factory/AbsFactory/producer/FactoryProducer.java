package com.nabin.Factory.AbsFactory.producer;

import com.nabin.Factory.AbsFactory.AbstractFactory;
import com.nabin.Factory.AbsFactory.ColorFactory;
import com.nabin.Factory.AbsFactory.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String whichone){
            switch (whichone){
                case "Shape":
                    return  new ShapeFactory();
                case "Color":
                    return new ColorFactory();
                default:
                    return null;
            }
        }
    }

