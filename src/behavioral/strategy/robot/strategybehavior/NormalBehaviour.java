package behavioral.strategy.robot.strategybehavior;

public class NormalBehaviour implements IBehavior {
    @Override
    public int move() {
        System.out.println("Normal Behaviour ");
        return 0;
    }
}
