package DakajLeon;
import robocode.*;

public class Kratos69 extends JuniorRobot
{

	public void run() {

		setColors(blue, yellow, yellow, blue, yellow);

		while(true) {	/*Robot goes forward in a circular motion*/
			turnGunRight(360);
			
			ahead(50);
			turnRight(10);
			ahead(50);
			turnRight(10);
			ahead(50);
			turnRight(10);
			ahead(50);
			turnRight(10);
			ahead(50);
		}
	}
	
	public void robotPlacement() {

	int distanceToNorthWall;
	int distanceToSouthWall;
	
	distanceToNorthWall = fieldHeight - robotY;
	distanceToSouthWall = fieldWidth - robotX;
	turnTo(0);
}

	public void onScannedRobot() {
		
		turnGunTo(scannedAngle);
		if (scannedDistance < 100)
		{
			fire (3);
		} 
		if (scannedDistance < 200)
		{
			fire (2.2);
		} 
		else
		{
			fire (1.5);
		}
	}

	public void onHitByBullet() {
		
		back(10);
		turnAheadLeft(70, 45 - hitByBulletBearing);
	}
	

	public void onHitWall() {

		back(100);
		turnRight(180);
	}
		
	public void scannedAngle() {
		
		fire(1.5);
	}
	
}
