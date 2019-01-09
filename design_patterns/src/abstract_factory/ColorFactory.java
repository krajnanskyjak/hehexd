package abstract_factory;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else {
            return null;
        }
    }

    public Shape getShape(String shape) {
        return null;
    }
}
