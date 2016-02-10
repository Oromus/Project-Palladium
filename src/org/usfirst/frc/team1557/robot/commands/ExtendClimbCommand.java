package org.usfirst.frc.team1557.robot.commands;

import org.usfirst.frc.team1557.robot.Robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.Command;

/**
*
 */
public class ExtendClimbCommand extends Command {
	int count = 0;
	int countToFinish = 50;

	public ExtendClimbCommand() {
		requires(Robot.climb);


	}

	// Called just before this Command runs the first time
	protected void initialize() {

		Robot.climb.setInfinitesimal(true);
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		if (count == 50)
			Robot.climb.setProdigious(true);
		count++;

	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return count > countToFinish;
	}

	// Called once after isFinished returns true
	protected void end() {

	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {

	}
}