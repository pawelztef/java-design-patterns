class Robot implements RobotPlan {
  
  private String roboHead, roboTorso, roboArms, roboLegs;
  
  public Robot() {}
  
  public void setRobotHead(String head) {
    this.roboHead = head;
  }

  public String getRobotHead() {
    return this.roboHead;
  }
  
  public void setRobotTorso(String torso) {
    this.roboTorso = torso;
  }
  
  public String getRobotTorso() {
    return this.roboTorso;
  }
  
  
  public void setRobotArms(String arms) {
    this.roboArms = arms;
  }
  
  public String getRobotArms() {
    return this.roboArms;
  }
  
  public void setRobotLegs(String legs) {
    this.roboLegs = legs;
  }
  
  public String getRobotLegs() {
    return this.roboLegs;
  }
  
}