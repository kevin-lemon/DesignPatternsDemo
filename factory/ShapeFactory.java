package com.pioneer.polaris.polaris.demo.factory;

/**
 * Created by wxk on 2018/5/2.
 */

public class ShapeFactory {

    public Shape getShape(String shapType){
        if (null == shapType){
            return null;
        }
        if (shapType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        if (shapType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        if (shapType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
