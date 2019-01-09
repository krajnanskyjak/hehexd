package abstract_factory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();
        ColorFactory cf = new ColorFactory();

        sf.getShape("circle").draw();
        sf.getShape("rectangle").draw();
        sf.getShape("square").draw();

        cf.getColor("red").fill();
        cf.getColor("blue").fill();
        cf.getColor("green").fill();

    }
}
