package proxy.test;

public class ProxyAudio implements Audio {
    private String fileName;
    private RealAudio realAudio;

    public ProxyAudio(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void play() {
        if(realAudio == null) {
            realAudio = new RealAudio(fileName);
        }
        realAudio.play();
    }
}
