// The Adapter must provide alternative action for the methods that need to be used
// becuase EnemyAttacker was implemented
public class EnemyRobotAdapter implements EnemyAttacker {
    EnemyRobot newRobot;
    public EnemyRobotAdapter(EnemyRobot newRobot) {
        this.newRobot = newRobot;
    }
    @Override
    public void fireWeapon() {
        newRobot.smashWithHands();
    }
    @Override
    public void moveForward() {
        newRobot.walkForward();
    }
    @Override
    public void assignDriver(String driverName) {
        newRobot.reactToHuman(driverName);
    }
}