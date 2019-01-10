package bridge;

public class Circle extends Shape {
    private int x, y , radius;

    public Circle(int x, int y, int radius, drawAPI drawapi) {
        super(drawapi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawapi.drawCircle(radius, x, y);
    }
}
