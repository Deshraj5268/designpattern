package behavioral.strategy.robot.strategybehavior;

public class DefensiveBehaviour implements IBehavior {
    @Override
    public int move() {
        System.out.println("Defensive behavior");
        return 1;
    }
}
