package org.usfirst.frc.team61.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonomousThreeStack extends CommandGroup {
	public AutonomousThreeStack(){
			addParallel(new ClawMoveAuto(15,1)); // Step 1
			addSequential(new BucketLift());
			addSequential(new ElevWithEncoder(30,.7));
			addSequential(new TurnForDegrees(162,.4));
			addSequential(new DriveForDistance(20,-.3)); // Step 2
			addSequential(new ClawToggle());
			addSequential(new DriveForDistance(20,-.3));
			addSequential(new TurnForDegrees(-160, .4)); // Step 3 // Needs to be tweaked.
			addSequential(new DriveForDistance(30,-.3));
			addParallel(new ClawMoveAuto(15,0)); // Step 4
			addSequential(new ElevWithEncoder(10,.7));
			addSequential(new ClawToggle()); // Step 5
			addSequential(new ReverseDriveForDistance(5,-.3));
			addSequential(new ElevWithEncoder(0,.7));
			addSequential(new DriveForDistance(10,-.3)); // Step 6
			addSequential(new ClawToggle());
			addParallel(new ClawMoveAuto(15,1));
			addParallel(new ElevWithEncoder(30,.7));
			addSequential(new ClawToggle());
			addSequential(new DriveForDistance(110,-.3));
			addSequential(new ClawToggle());
//			addSequential(new TurnForDegrees(-80,.3)); // Step 7
//			addParallel(new ElevWithEncoder(25,.6)); // Will need to be tweaked
//			addSequential(new DriveForDistance(136,-.4));
//			addParallel(new ClawMoveAuto(15,0));
//			addSequential(new ClawToggle());
//			addSequential(new ReverseDriveForDistance(5,-.3));
//			addSequential(new ElevWithEncoder(0,.7));
		}

	
	}
	

