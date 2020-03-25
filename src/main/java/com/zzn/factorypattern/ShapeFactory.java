package com.zzn.factorypattern;

/**
 * @author zzn
 * @version 1.0 创建时间 2020/3/22 20:56
 */
public class ShapeFactory {

    private static final String RECTANGLE = "RECTANGLE";
    private static final String SQUARE = "SQUARE";

    /**
     * 使用 getShape 方法获取形状类型的对象
     * @param shapeType type
     * @return Shape
     */
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(RECTANGLE.equalsIgnoreCase(shapeType)){
            return new Rectangle();
        } else if(SQUARE.equalsIgnoreCase(shapeType)){
            return new Square();
        }
        return null;
    }
}
