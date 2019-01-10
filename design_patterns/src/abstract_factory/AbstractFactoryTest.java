package abstract_factory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        FactoryProducer fp = new FactoryProducer();
        AbstractFactory shapeFactory = fp.getFactory("shape");
        AbstractFactory colorFactory = fp.getFactory("color");

        Shape rectangle = shapeFactory.getShape("rectangle");
        Shape square = shapeFactory.getShape("square");
        Shape circle = shapeFactory.getShape("circle");

        Color red = colorFactory.getColor("red");
        Color green = colorFactory.getColor("green");
        Color blue = colorFactory.getColor("blue");

        rectangle.draw();
        square.draw();
        circle.draw();

        red.fill();
        green.fill();
        blue.fill();

    }
}
