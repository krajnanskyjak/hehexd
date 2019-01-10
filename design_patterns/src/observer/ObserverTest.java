package observer;

public class ObserverTest {
    public static void main(String[] args) {
        Subject s = new Subject();

        Observer hexObs = new HexObserver(s);
        Observer octObs = new OctalObserver(s);

        s.setState(3);
        s.setState(4);
        s.setState(5);
    }
}
