import java.util.Random;
public class EnemyTank implements EnemyAttacker {
    Random generator = new Random();
    @Override
    public void fireWeapon() {
        int damage = generator.nextInt(10) + 1;
        System.out.println("EnemyTank does " + damage + " damage.");
    }
    @Override
    public void moveForward() {
        int move = generator.nextInt(5) + 5;
        System.out.println("EnemyTank moves " + move + " spaces.");
    }
    @Override
    public void assignDriver(String driverName) {
        System.out.println(driverName + " drives tank");
    }
}