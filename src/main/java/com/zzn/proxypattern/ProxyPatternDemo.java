package com.zzn.proxypattern;

/**
 * @author zzn
 * @version 1.0 创建时间 2020/3/22 21:27
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("---");
        // 图像不需要从磁盘加载
        image.display();
    }
}
