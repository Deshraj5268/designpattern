package behavioral.statepattern.standard;

public class TerminalState implements State{
    @Override
    public void execute(BasicContext context) {
        System.out.println("i am in TerminalState");
        context.setCurrentState(null);
    }
}
