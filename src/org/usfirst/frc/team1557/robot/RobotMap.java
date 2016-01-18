package org.usfirst.frc.team1557.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */


public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;
	public static final int driveMotorOne_ID = 0;
	public static final int driveMotorTwo_ID = 1;
	public static final int driveMotorThree_ID = 2;
	public static final int driveMotorFour_ID = 3;
	
	public static final int rotateMotorOne_ID = 4;
	public static final int rotateMotorTwo_ID = 5;
	public static final int intakeMotorOne_ID = 6;
	
	public static final int rotateEncoderA_ID = 0;
	public static final int rotateEncoderB_ID = 1;
	
	public static final int mainJoyAxis1_ID = 1;
	public static final int mainJoyAxis2_ID = 1;
	
	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
