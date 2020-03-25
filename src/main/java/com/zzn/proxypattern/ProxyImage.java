package com.zzn.proxypattern;

/**
 * @author zzn
 * @version 1.0 创建时间 2020/3/22 21:26
 */
public class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
