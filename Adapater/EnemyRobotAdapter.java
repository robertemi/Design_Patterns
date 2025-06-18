package Adapater;

public class EnemyRobotAdapter implements EnemyAttacker{

    EnemyRobot robot;

    public EnemyRobotAdapter(EnemyRobot newRobot){
        robot = newRobot;
    }

    @Override
    public void drive() {
        robot.walk();
    }

    @Override
    public void assignDriver() {
        robot.react();        
    }

    @Override
    public void fireWeapon() {
        robot.smash();
    }

}