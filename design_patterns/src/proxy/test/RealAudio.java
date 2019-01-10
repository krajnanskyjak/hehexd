package proxy.test;

public class RealAudio implements Audio {
    private String fileName;

    public RealAudio(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void play() {
        System.out.println("RealAudio is playing: " + fileName);
    }

    public void loadFromDisk(String fileName) {
        System.out.println("RealAudio loading from disk: " + fileName);
    }
}
