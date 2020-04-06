package com.example.quizzer.adapters;

import java.util.Random;

// this class directly implements the EnemyAttacker interface
public class EnemyTank implements EnemyAttacker {

    // nothing related to design pattern
    private Random random = new Random();

    @Override
    public void fireWeapon() {
        int attackDamage = random.nextInt(10) + 1;

        System.out.println("EnemyTank does " + attackDamage + " damage.");

    }

    @Override
    public void driveForward() {
        int movement = random.nextInt(5) + 1;

        System.out.println("EnemyTank moves " + movement + " spaces.");
    }

    @Override
    public void assignDriver(String driverName) {
        System.out.println(driverName + " is driving the tank.");
    }
}
