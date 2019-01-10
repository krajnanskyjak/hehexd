package proxy.test;

public class ProxyTest {
    public static void main(String[] args) {
        ProxyAudio pa = new ProxyAudio("lel.mp3");
        pa.play();
        pa.play();
    }
}
