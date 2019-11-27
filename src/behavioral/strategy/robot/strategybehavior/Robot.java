package behavioral.strategy.robot.strategybehavior;

public class Robot {

    private IBehavior iBehavior;

    private String behaviorName;

    public Robot(String behaviorName) {
        this.behaviorName = behaviorName;
    }

    public IBehavior getiBehavior() {
        return iBehavior;
    }

    public void setiBehavior(IBehavior iBehavior) {
        this.iBehavior = iBehavior;
    }

    public String getBehaviorName() {
        return behaviorName;
    }

    public void setBehaviorName(String behaviorName) {
        this.behaviorName = behaviorName;
    }

    public boolean moveCommand(){

        System.out.println(this.behaviorName + ": Based on current position" +
                "the behaviour object decide the next move:");
        int command = iBehavior.move();
        // ... send the command to mechanisms
        System.out.println("\tThe result returned by behaviour object " +
                "is sent to the movement mechanisms " +
                " for the robot '"  + this.behaviorName + "'");

        return true;
    }
}
