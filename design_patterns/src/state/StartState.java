package state;


public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Context Object is in Start State");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}
