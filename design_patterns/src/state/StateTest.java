package state;

public class StateTest {
    public static void main(String[] args) {
        State startState = new StartState();
        State stopState = new StopState();
        Context contextObj = new Context();

        startState.doAction(contextObj);

        System.out.println(contextObj.getState());

        stopState.doAction(contextObj);

        System.out.println(contextObj.getState());
    }
}
