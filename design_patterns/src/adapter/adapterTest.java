package adapter;

public class adapterTest {
    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer();
        ap.play("mp4", "lel.mp4");
        ap.play("mp3", "kek.mp3");
        ap.play("vlc", "heh.vlc");

        ap.play("kekek", "wrong.kekek");
    }
}
