package com.zzn.adapterpattern;

/**
 * @author zzn
 * @version 1.0 创建时间 2020/3/22 21:14
 */
public class Mp4Player implements AdvancedMediaPlayer{

    public void playVlc(String fileName) {
        //什么也不做
    }

    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
