package com.zzn.abstractfactorypattern;

/**
 * @author zzn
 * @version 1.0 创建时间 2020/3/25 21:03
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}
