package Interfaces;

public class Main {
    public static void main(String[] args) {
        MediaController start = new MediaController();
        VideoPlayer video = new VideoPlayer();
        MusicPlayer cd = new MusicPlayer();
        start.playMedia(cd);
        start.playMedia(video);


    }
}
