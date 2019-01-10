package bridge.test;

public abstract class Shape {
    protected FillAPI fillAPI;

    protected Shape() {

    }

    protected Shape(FillAPI fillAPI) {
        this.fillAPI = fillAPI;
    }

    public abstract void fill();
}
