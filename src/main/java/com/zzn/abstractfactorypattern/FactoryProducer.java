package com.zzn.abstractfactorypattern;

/**
 * @author zzn
 * @version 1.0 创建时间 2020/3/25 21:06
 */
public class FactoryProducer {

    private static final String SHAPE = "SHAPE";
    private static final String COLOR = "COLOR";

    public static AbstractFactory getFactory(String choice){
        if(SHAPE.equalsIgnoreCase(choice)){
            return new ShapeFactory();
        } else if(COLOR.equalsIgnoreCase(choice)){
            return new ColorFactory();
        }
        return null;
    }
}