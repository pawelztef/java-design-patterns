public interface EnemyAttacker {
    // This is target Inteface.
    // It is the adapters job to make new classes compatible with this interface.
    void fireWeapon();
    void moveForward();
    void assignDriver(String driverName);
}