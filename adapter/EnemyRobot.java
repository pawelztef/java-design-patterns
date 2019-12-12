// This is the adaptee.
// The adapter sends method calls to the objects that use EnemyAttacker interface
// to the right methods defined in EnemyRobot.
import java.util.Random;
public class EnemyRobot {
    
    Random generator = new Random();
    
    public void smashWithHands() {
        int damage = generator.nextInt(10) + 1;
        System.out.println("Enemy Robot causes " + damage + " with his hands.");
    }
    
    public void walkForward() {
        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy Robot moved " + movement);
    }
    
    public void reactToHuman(String driverName) {
        System.out.println("Enemy Robot reacts to " + driverName);
    }
}