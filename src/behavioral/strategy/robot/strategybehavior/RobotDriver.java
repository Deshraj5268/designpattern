package behavioral.strategy.robot.strategybehavior;

public class RobotDriver {

    public static void main(String[] args) {

        Robot r1 = new Robot("Big Robot");
        Robot r2 = new Robot("George v.2.1");
        Robot r3 = new Robot("R2");

        r1.setiBehavior(new AggressiveBehavior());
        r2.setiBehavior(new DefensiveBehaviour());
        r3.setiBehavior(new NormalBehaviour());

        r1.moveCommand();
        r2.moveCommand();
        r3.moveCommand();

        System.out.println("New behaviours: Big Robot' gets really scared 'George v.2.1' becomes really mad because and R2 keeps its calm");

        r1.setiBehavior(new DefensiveBehaviour());
        r2.setiBehavior(new AggressiveBehavior());

        r1.moveCommand();
        r2.moveCommand();
        r3.moveCommand();
    }
}
