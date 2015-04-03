package org.usfirst.frc.team61.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoNull extends CommandGroup {
	public AutoNull(){
		System.out.println("Auto Null Running");
		addSequential(new BucketLift());
		addSequential(new WaitForTime(.3));
    	addSequential(new DriveForDistance(136, -.4));
	}
}
