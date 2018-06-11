package bots;

import robocode.*;

public class TeamBlue extends Robot {

    public void run() {
        double heading = getHeading();
        if (heading >180){
            turnRight(360-heading);
        } else {

            turnLeft(heading);
        }

        while (true) {
            ahead(50);
//                 turnRadarGun(1);
        }
    }

    @Override
    public void onHitByBullet(HitByBulletEvent event) {
        double bulletDirection = event.getBearing();
        turnLeft(bulletDirection );
//        turnRadarGun(bulletDirection );
        fire(3);
//        ahead(100);

    }

    @Override
    public void onHitWall(HitWallEvent event) {
        double bearing = event.getBearing();
        turnLeft(90);
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent event) {
        double robotDirection = event.getBearing();
        fire(3);
    }

    private void turnRadarGun (double degrees) {
        turnGunLeft(degrees);
        turnRadarLeft(degrees);
    }
}

