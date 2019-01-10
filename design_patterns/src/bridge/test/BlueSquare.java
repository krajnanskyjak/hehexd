package bridge.test;

public class BlueSquare implements FillAPI {
    @Override
    public void fillSquare(int hue, int contrast, int brightness) {
        System.out.println("Blue Square is being filled, hue, contrast, brightness: " + hue + ", " + contrast + ", " + brightness);
    }
}
