package com.zzn.abstractfactorypattern;

/**
 * @author zzn
 * @version 1.0 创建时间 2020/3/25 21:03
 */
public class ShapeFactory extends AbstractFactory {

    private static final String RECTANGLE = "RECTANGLE";
    private static final String SQUARE = "SQUARE";
    private static final String CIRCLE = "CIRCLE";

    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(CIRCLE.equalsIgnoreCase(shapeType)){
            return new Circle();
        } else if(RECTANGLE.equalsIgnoreCase(shapeType)){
            return new Rectangle();
        } else if(SQUARE.equalsIgnoreCase(shapeType)){
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
