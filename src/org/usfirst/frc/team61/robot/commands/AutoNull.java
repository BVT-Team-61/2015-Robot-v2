package org.usfirst.frc.team61.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoNull extends CommandGroup {
	public AutoNull(){
		System.out.println("Auto Null Running");
		addSequential(new BucketLift());
		addSequential(new WaitForTime(.3));
    	addSequential(new DriveForDistance(118, -.4));
    	addSequential(new TurnForDegrees(70,.4));
    	addSequential(new WaitForTime(2));
    	addSequential(new BucketLift());
	}
}
