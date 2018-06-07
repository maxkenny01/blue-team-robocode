package bots;


import robocode.Robot;
import robocode.ScannedRobotEvent;

public class SampleBot extends Robot {

    public void run() {
        // Spin the gun around slowly... forever
        while (true) {
         turnGunRight(4);
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
