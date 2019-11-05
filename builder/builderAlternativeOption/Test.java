class Test {
  public static void main(String... args) {
    RobotBuilder oldStyle = new OldRobotBuilder();
    RobotEngineer engineer = new RobotEngineer(oldStyle);
    engineer.makeRobot();
    Robot robot = engineer.getRobot();
    System.out.println("Robot Built");
    System.out.println("Robot head type: " + robot.getRobotHead());
    System.out.println("Robot torso type: " + robot.getRobotTorso());
    System.out.println("Robot arms type: " + robot.getRobotArms());
    System.out.println("Robot legs type: " + robot.getRobotLegs());
  }
}