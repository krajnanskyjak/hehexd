package state;

public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Context Object is in Stop State");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
