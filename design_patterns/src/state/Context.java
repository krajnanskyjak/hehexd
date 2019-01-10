package state;

public class Context {
    private State state;

    public void setState(State stateObject) {
        this.state = stateObject;
    }

    public State getState() {
        return state;
    }
}
