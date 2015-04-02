package org.usfirst.frc.team61.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
public class AutoThreeTote extends CommandGroup {
	public AutoThreeTote(){
			addParallel(new ClawSetAuto(1)); // Step 1
			addSequential(new BucketLift());
			addParallel(new ElevWithEncoder(30,.7));
			addSequential(new WaitForTime(.3));
			addSequential(new TurnForDegrees(155,.45));
			addSequential(new DriveForDistance(20,-.4)); // Step 2 // Tweak up?
			addSequential(new ClawToggle());
			addSequential(new DriveForDistance(20,-.4)); // Tweak up?
			addSequential(new TurnForDegrees(-140, .45)); // Step 3 // Needs to be tweaked.
			addSequential(new BucketLift());
			addSequential(new DriveForDistance(55,-.7));
			addSequential(new ElevWithEncoder(10,.7)); // Tweak up?
			addSequential(new ClawToggle()); // Step 5
			addSequential(new ReverseDriveForDistance(5,-.3));
			addSequential(new ElevWithEncoder(0,.8));
			addSequential(new DriveForDistance(10,-.3)); // Step 6
			addSequential(new ClawToggle());
			addParallel(new ElevWithEncoder(30,.7)); // LIFT
			addSequential(new ClawToggle());
			addSequential(new DriveForDistance(55,-.7)); //Changed from 67
			addSequential(new ClawToggle());
			addSequential(new WaitForTime(.5));
			addSequential(new TurnForDegrees(70,.5)); // Step 7
			addSequential(new DriveForDistance(75,-.8));
			addSequential(new DriveForDistance(15,-.4));
			addSequential(new ElevWithEncoder(12,.6));
			addSequential(new ClawToggle());
			addSequential(new ReverseDriveForDistance(10,-.3));
		}

	
	}
	

