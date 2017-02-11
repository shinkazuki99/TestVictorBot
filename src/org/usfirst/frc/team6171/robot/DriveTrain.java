package org.usfirst.frc.team6171.robot;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;

public class DriveTrain extends RobotDrive{
	
	public DriveTrain(){
	super(new VictorSP(RobotMap.KleftFront), new VictorSP(RobotMap.KleftRear), new VictorSP(RobotMap.KrightFront), new VictorSP(RobotMap.KrightRear));
	setInvertedMotor(MotorType.kFrontRight, true);
	setInvertedMotor(MotorType.kRearRight, true);
	setInvertedMotor(MotorType.kFrontLeft, true);
	setInvertedMotor(MotorType.kRearLeft, true);
	}
}
