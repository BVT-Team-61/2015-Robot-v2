package org.usfirst.frc.team61.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoTwoTote extends CommandGroup {
	public AutoTwoTote(){
		System.out.println("Two Tote Auto Running");
		addSequential(new BucketLift()); // Step 1. Rollers in,Bucket lifted. 
		//addSequential(new ClawMoveAuto(1,1));
		addSequential(new ElevWithEncoder(30,.8)); //Step 2. Up arm, turn right 180 degrees, open arms
		addSequential(new TurnForDegrees(165,.4)); 
		addSequential(new DriveForDistance(30,-.4));// Step 3. Move forward. 
		addSequential(new ClawToggle());// step 4. close arm. suck in roller,
		addSequential(new ClawSetAuto(1));
		addSequential(new TurnForDegrees(-80,.4));// step 5. turn 90 degrees
		addSequential(new DriveForDistance(60,-.5));// step 6 go forward
		addSequential(new DriveForDistance(76,-.4));// step 6 go forward
		addSequential(new TurnForDegrees(-70,.4));//turn left 90 degrees
		//addSequential(new BucketLift());// drop the bucket
	}
}
