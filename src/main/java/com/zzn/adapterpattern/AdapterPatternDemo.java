package com.zzn.adapterpattern;

/**
 * 适配器不是在详细设计时添加的，而是解决正在服役的项目的问题。
 * @author zzn
 * @version 1.0 创建时间 2020/3/22 21:11
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
