package adapter;

public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapt;

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        } else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapt = new MediaAdapter(audioType);
            mediaAdapt.play(audioType, fileName);
        } else {
            System.out.println("Incorrect media type");
        }
    }
}
