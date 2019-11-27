package behavioral.strategy.robot.strategybehavior;

public class AggressiveBehavior implements IBehavior {
    @Override
    public int move() {
        System.out.println("aggressive behavior");
        return -1;
    }
}
