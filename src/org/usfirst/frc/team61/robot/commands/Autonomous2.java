package org.usfirst.frc.team61.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Autonomous2 extends CommandGroup {
	public Autonomous2(){
		addSequential(new BucketLift()); // Step 1. Rollers in,Bucket lifted. 
		//addSequential(new ClawMoveAuto(1,1));
		addSequential(new ElevWithEncoder(30,.5)); //Step 2. Up arm, turn right 180 degrees, open arms
		addSequential(new ClawToggle());
		addSequential(new TurnForDegrees(165,.4)); 
		addSequential(new DriveForDistance(34,-.4));// Step 3. Move forward. 
		addSequential(new ClawToggle());// step 4. close arm. suck in roller,
		addSequential(new ClawMoveAuto(1.5,1));
		addParallel(new ClawMoveAuto(5,1));
		addSequential(new TurnForDegrees(-80,.4));// step 5. turn 90 degrees
		addSequential(new DriveForDistance(60,-.5));// step 6 go forward
		addSequential(new DriveForDistance(76,-.4));// step 6 go forward
		addSequential(new TurnForDegrees(-80,.35));//turn left 90 degrees
		addSequential(new BucketLift());// drop the bucket
		// wouldnt publish so i added something new just ignore this
	    
	}
}
