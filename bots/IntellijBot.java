package bots;

import robocode.Robot;
import robocode.ScannedRobotEvent;

public class IntellijBot extends Robot {

    public void run() {
        // Spin the gun around slowly... forever
        while (true) {
            turnGunLeft(5);
            turnLeft(10);
            ahead(10);
        }
    }

    /**
     * onScannedRobot:  Fire!
     */
    public void onScannedRobot(ScannedRobotEvent e) {
        if (e.getDistance() < 50 && getEnergy() > 50) {
            fire(3);
        }
        else {
            fire(1);
        }
        scan();
    }
}
