package bridge;

public class RedCircle implements drawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing red circle; Radius: " + radius + ", X: " + x + ", Y: " + y);
    }
}
