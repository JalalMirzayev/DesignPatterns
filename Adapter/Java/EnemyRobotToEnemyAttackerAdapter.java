package com.example.quizzer.adapters;

public class EnemyRobotToEnemyAttackerAdapter implements EnemyAttacker {

    private EnemyRobot enemyRobot;

    public EnemyRobotToEnemyAttackerAdapter(EnemyRobot enemyRobot) {
        this.enemyRobot = enemyRobot;
    }

    @Override
    public void fireWeapon() {
        enemyRobot.smashWithHands();
    }

    @Override
    public void driveForward() {
        enemyRobot.walkForward();
    }

    @Override
    public void assignDriver(String driverName) {
        enemyRobot.reactToHuman(driverName);
    }
}
