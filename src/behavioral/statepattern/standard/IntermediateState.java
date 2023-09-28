package behavioral.statepattern.standard;

public class IntermediateState implements  State {

    @Override
    public void execute(BasicContext context) {
        System.out.println("i am in IntermediateState");
        context.setCurrentState(new TerminalState());
    }
}
