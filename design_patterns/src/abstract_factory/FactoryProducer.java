package abstract_factory;

public class FactoryProducer {
    public AbstractFactory getFactory(String name) {
        if(name.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if(name.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        } else {
            return null;
        }
    }
}
