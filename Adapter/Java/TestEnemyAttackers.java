package com.example.quizzer.adapters;

public class TestEnemyAttackers {

    public static void main(String[] args){
        // instance of direct implementation
        EnemyTank rx7Tank = new EnemyTank();
        // instance of EnemyRobot
        EnemyRobot fredTheRobot = new EnemyRobot();
        // EnemyAttacker by using the adapter
        EnemyAttacker enemyRobotToEnemyAttackerAdapter = new EnemyRobotToEnemyAttackerAdapter(fredTheRobot);

        System.out.println("The robot.");
        fredTheRobot.reactToHuman("Paul");
        fredTheRobot.walkForward();
        fredTheRobot.smashWithHands();

        System.out.println("The enemy tank.");
        rx7Tank.assignDriver("Frank");
        rx7Tank.driveForward();
        rx7Tank.fireWeapon();

        System.out.println("The robot with adapter");
        enemyRobotToEnemyAttackerAdapter.assignDriver("Mark");
        enemyRobotToEnemyAttackerAdapter.driveForward();
        enemyRobotToEnemyAttackerAdapter.fireWeapon();
    }
}
