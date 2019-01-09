package abstract_factory.practice;

public abstract class AbstractFactory {
    abstract String intToString(int val);

    public static void main(String[] args) {
        int i = 12;
        StringFactory sf = new StringFactory();
        String s = sf.intToString(i);

        System.out.println(s);
    }
}
