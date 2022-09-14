package structural.adapter.war;

import structural.adapter.war.adaptee.EnemyRobot;
import structural.adapter.war.adapter.EnemyRobotAdapter;
import structural.adapter.war.target.EnemyAttacker;

public class Demo {

    public static void main(String[] args) {
        EnemyRobot enemyRobot = new EnemyRobot();

        EnemyAttacker robotAdapter = new EnemyRobotAdapter(enemyRobot);

        System.out.println("The robot with adapter");

        robotAdapter.fireWeapon();
        robotAdapter.driveForward();
        robotAdapter.assignDriver("Paul");

        EnemyTank tank = new EnemyTank();

        System.out.println();

        System.out.println("The enemy tank");

        tank.fireWeapon();
        tank.driveForward();
        tank.assignDriver("Paul");

        System.out.println();

        System.out.println("The enemy robot");

        enemyRobot.smashWithHands();
        enemyRobot.walkForward();
        enemyRobot.reactToHuman("Paul");


    }
}
