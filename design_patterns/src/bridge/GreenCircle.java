package bridge;

public class GreenCircle implements drawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing green circle; radius: " + radius + ", X: " + x + ", Y: " + y);
    }
}
