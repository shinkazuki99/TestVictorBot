package org.usfirst.frc.team6171.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	
	public static final double MAX_SPEED = 0.5;
	
	DriveTrain driveTrain;
	OI oi;

	public void robotInit() {
		driveTrain = new DriveTrain();
		oi = new OI();
	}

	public void autonomousInit() {
		
	}

	public void autonomousPeriodic() {
		
	}

	@Override
	public void teleopPeriodic() {
		driveTrain.arcadeDrive(oi.getDriveLeftY()*MAX_SPEED,oi.getDriveRightX()*MAX_SPEED);
	}

	public void testPeriodic() {
	
	}
}

