package org.usfirst.frc.team61.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonomousThreeStack extends CommandGroup {
	public AutonomousThreeStack(){
			addParallel(new ClawSetAuto(1)); // Step 1
			addSequential(new BucketLift());
			addParallel(new ElevWithEncoder(30,.7));
			addSequential(new WaitForTime(.3));
			addSequential(new TurnForDegrees(155,.45));
			addSequential(new DriveForDistance(20,-.4)); // Step 2 // Tweak up?
			addSequential(new ClawToggle());
			addSequential(new DriveForDistance(20,-.4)); // Tweak up?
			addSequential(new TurnForDegrees(-145, .45)); // Step 3 // Needs to be tweaked.
			addSequential(new BucketLift());
			addSequential(new DriveForDistance(55,-.7));
			addSequential(new ClawSetAuto(0)); // Step 4 - DROP
			addSequential(new ElevWithEncoder(10,.7)); // Tweak up?
			addSequential(new ClawToggle()); // Step 5
			addSequential(new ReverseDriveForDistance(5,-.3));
			addSequential(new ElevWithEncoder(0,.8));
			addSequential(new DriveForDistance(10,-.3)); // Step 6
			addSequential(new ClawToggle());
			addSequential(new ClawSetAuto(1));
			addParallel(new ElevWithEncoder(30,.7)); // LIFT
			addSequential(new ClawToggle());
			addSequential(new DriveForDistance(52,-.7));
			addSequential(new DriveForDistance(15,-.4));
			addSequential(new ClawToggle());
			addSequential(new TurnForDegrees(85,.4)); // Step 7 // Slow down??
			addSequential(new DriveForDistance(80,-.8));
			addSequential(new DriveForDistance(16,-.4));
			addSequential(new ClawSetAuto(0));
			addSequential(new ElevWithEncoder(12,.6));
			addSequential(new ClawToggle());
			addSequential(new ReverseDriveForDistance(10,-.3));
		}

	
	}
	

