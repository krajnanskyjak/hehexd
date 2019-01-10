package bridge.test;

public class YellowSquare implements FillAPI {
    @Override
    public void fillSquare(int hue, int contrast, int brightness) {
        System.out.println("Red Square is being filled, hue, contrast, brightness: " + hue + ", " + contrast + ", " + brightness);
    }
}
