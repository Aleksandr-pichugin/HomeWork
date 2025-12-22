import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Playable> play = new java.util.ArrayList<>();

        play.add(new MusicPlayer());
        play.add(new VideoPlayer());

        for (Playable p : play) {
            p.play();
        }
    }
}



