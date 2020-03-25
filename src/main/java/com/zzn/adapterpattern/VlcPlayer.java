package com.zzn.adapterpattern;

/**
 * @author zzn
 * @version 1.0 创建时间 2020/3/22 21:14
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    public void playMp4(String fileName) {
        //什么也不做
    }
}
