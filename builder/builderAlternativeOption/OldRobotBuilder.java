class OldRobotBuilder implements RobotBuilder {
 
  private Robot robot;
  
  public OldRobotBuilder() {
    this.robot = new Robot();
  }
  
  public void buildRobotHead() {
    robot.setRobotHead("Thiny head");
  }
  
  public void buildRobotTorso() {
    robot.setRobotTorso("Thini torso");
  }
  
  public void buildRobotArms() {
    robot.setRobotArms("Blowtorch arms");
  }
  
  public void buildRobotLegs() {
    robot.setRobotLegs("Thiny legs");
  }
  
  public Robot getRobot() {
    return this.robot;
  }
}