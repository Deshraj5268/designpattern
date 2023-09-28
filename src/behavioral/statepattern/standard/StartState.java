package behavioral.statepattern.standard;

public class StartState implements State{
    @Override
    public void execute(BasicContext context) {
        System.out.println("i am in InitSate");
        context.setCurrentState(new IntermediateState());
    }
}
