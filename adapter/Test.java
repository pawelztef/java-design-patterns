public class Test {
 public static void main(String... args) {
     System.out.println("Enemy Tank");
     EnemyTank rx7Tank = new EnemyTank();
     rx7Tank.assignDriver("Josh£");
     rx7Tank.moveForward();
     rx7Tank.fireWeapon();
     System.out.println();
     System.out.println("Enemy Robot");
     EnemyRobot robot = new EnemyRobot();
     robot.reactToHuman("Josh£");
     robot.smashWithHands();
     robot.walkForward();
     System.out.println();
     System.out.println("The Robot in Adapter");
     EnemyAttacker robotAdapter = new EnemyRobotAdapter(robot);
     robotAdapter.assignDriver("Hennry");
     robotAdapter.moveForward();
     robotAdapter.fireWeapon();
 }
}