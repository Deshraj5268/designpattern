package behavioral.statepattern.standard;

public class BasicContext {

    State currentState;



    public BasicContext(){
        currentState = new StartState();
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}
