/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc.team61.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Autonomous command group.
 * @author Team-61
 */
public class AutonomousGroup extends CommandGroup {
    
    public AutonomousGroup() {
    	
    	// Full auto 
    	addParallel(new ElevWithEncoder(40, .4)); // Try 34 next.
    	addSequential(new WaitForTime(0.9));
    	addSequential(new DriveForDistance(10, -.5));
    	addSequential(new ClawToggle());
    	addSequential(new ClawMoveAuto(1, 1));
    	addSequential(new TurnForDegrees(-80, 0.3));
    	addSequential(new DriveForDistance(136, -.45)); // Try 134 or 132 next.
    	addSequential(new WaitForTime(0.75));
    	addSequential(new TurnForDegrees(-80, 0.3));
    	addSequential(new ClawToggle());
    	addSequential(new WaitForTime(0.5));
    	//addSequential(new ElevWithEncoder(7, .4));
    	addSequential(new ReverseDriveForDistance(20, -0.4));
    	addSequential(new ClawToggle());
    	addSequential(new TurnForDegrees(-160, 0.3));
    	addSequential(new ClawToggle());
    	
    	// No tote
//    	addParallel(new ElevWithEncoder(40, .4)); // Try 34 next.
//    	addSequential(new WaitForTime(0.9));
////    	addSequential(new TurnForDegrees(-80, 0.3)); // Needed if parallel to wall.
//    	addSequential(new DriveForDistance(136, -.45)); // Try 134 or 132 next.
    }

}
