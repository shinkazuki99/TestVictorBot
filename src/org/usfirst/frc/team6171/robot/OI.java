package org.usfirst.frc.team6171.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	public static final int LEFTX = 0;
	public static final int LEFTY = 1;
	public static final int RTRIGGER = 3;
	public static final int LTRIGGER = 2;
	public static final int RIGHTX = 4;
	public static final int RIGHTY = 5;

	public static final int A_NUM = 1;
	public static final int B_NUM = 2;
	public static final int X_NUM = 3;
	public static final int Y_NUM = 4;
	public static final int LB_NUM = 5;
	public static final int RB_NUM = 6;
	public static final int BACK_NUM = 7;
	public static final int START_NUM = 8;
	public static final int LEFT_JOY_NUM = 9;
	public static final int RIGHT_JOY_NUM = 10;
	
	public static final float RUMBLE_ON = 1;
	public static final float RUMBLE_OFF = 0;
	
	
	JoystickButton dX, dA, dB, dY, dLB, dRB, dBack, dStart, dLeftJoy, dRightJoy;
	Joystick drive;
	
	public OI(){
		
		drive = new Joystick(0);
		dA = new JoystickButton(drive, A_NUM);
		dB = new JoystickButton(drive, B_NUM);
		dX = new JoystickButton(drive, X_NUM);
		dY = new JoystickButton(drive, Y_NUM);
		dLB = new JoystickButton(drive, LB_NUM);
		dRB = new JoystickButton(drive, RB_NUM);
		dBack = new JoystickButton(drive, BACK_NUM);
		dStart = new JoystickButton(drive, START_NUM);
		dLeftJoy = new JoystickButton(drive, LEFT_JOY_NUM);
		dRightJoy = new JoystickButton(drive, RIGHT_JOY_NUM);

	}
	
	//returns value of axis
	public double getDriveLeftY(){
		return drive.getRawAxis(LEFTY);
	}
	public double getDriveLeftX(){
		return drive.getRawAxis(LEFTX);
	}
	public double getDriveRightY(){
		return drive.getRawAxis(RIGHTY);
	}
	public double getDriveRightX(){
		return drive.getRawAxis(RIGHTX);
	}
	public double getDriveRightTrigger()
	{
		return drive.getRawAxis(RTRIGGER);
	}
	public double getDriveLeftTrigger()
	{
		return drive.getRawAxis(LTRIGGER);
	}
}
