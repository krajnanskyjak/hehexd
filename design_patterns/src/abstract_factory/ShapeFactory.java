package abstract_factory;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        if(shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else {
            return null;
        }
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
