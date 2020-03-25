package com.zzn.abstractfactorypattern;

/**
 * @author zzn
 * @version 1.0 创建时间 2020/3/25 21:05
 */
public class ColorFactory extends AbstractFactory {

    private static final String RED = "RED";
    private static final String GREEN = "GREEN";
    private static final String BLUE = "BLUE";

    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(RED.equalsIgnoreCase(color)){
            return new Red();
        } else if(GREEN.equalsIgnoreCase(color)){
            return new Green();
        } else if(BLUE.equalsIgnoreCase(color)){
            return new Blue();
        }
        return null;
    }
}