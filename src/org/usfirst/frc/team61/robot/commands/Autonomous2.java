package org.usfirst.frc.team61.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Autonomous2 extends CommandGroup {
	public Autonomous2(){
		addParallel(new ClawMoveAuto(1,1));// Step 1. Rollers in,Bucket lifted. 
		addParallel(new BucketLift());
		addSequential(new ElevWithEncoder(30,.4));//Step 2. Up arm, turn right 180 degrees, open arms
		addParallel(new TurnForDegrees(160,.3));
		addParallel(new ClawToggle());
		addSequential(new DriveForDistance(3,.4));// Step 3. Move forward. 
		addSequential(new ClawToggle());// step 4. close arm. suck in roller, 
		addParallel(new ClawMoveAuto(1,1));
		addSequential(new TurnForDegrees(-80,.3));// step 5. turn 90 degrees
		addSequential(new DriveForDistance(136,-.4));// step 6 go forward
		addSequential(new TurnForDegrees(-80,.3));//turn left 90 degrees
		addSequential(new BucketLift());// drop the bucket
		// wouldnt publish so i added something new just ignore this
	    
	}
}
