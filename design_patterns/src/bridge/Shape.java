package bridge;

public abstract class Shape {
    protected drawAPI drawapi;

    protected Shape(drawAPI drawapi) {
        this.drawapi = drawapi;
    }

    protected Shape() {

    }

    public abstract void draw();
}
