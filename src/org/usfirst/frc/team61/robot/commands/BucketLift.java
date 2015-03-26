package org.usfirst.frc.team61.robot.commands;

public class BucketLift extends CommandBase {
	
	public BucketLift(){
		requires(bucket);
	}

	protected void initialize(){
		bucket.setState(!bucket.getState());
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