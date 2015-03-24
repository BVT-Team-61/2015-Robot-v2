package org.usfirst.frc.team61.robot.commands;

public class BucketLift extends CommandBase {
	
	public BucketLift(){
		requires(bucketlift);
	}

protected void initialize(){
	bucketlift.setState(!bucketlift.getState());
}
	
    protected void execute(){
    	
    }
    protected boolean isFinished(){
    	return true;
    }
    protected void end(){
    	
    }
    protected void interrupted(){
    	
    }
}