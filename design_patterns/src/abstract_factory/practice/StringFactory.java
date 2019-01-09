package abstract_factory.practice;

public class StringFactory extends AbstractFactory {
    @Override
    public String intToString(int val) {

        return Integer.toString(val);
    }
}
