package behavioral.statepattern.standard;

public class StandardStateDriver {

    public static void main(String[] args) {
        BasicContext basicContext = new BasicContext();
        State state = new StartState();
        while (basicContext.currentState != null){
            basicContext.currentState.execute(basicContext);
        }
    }
}
