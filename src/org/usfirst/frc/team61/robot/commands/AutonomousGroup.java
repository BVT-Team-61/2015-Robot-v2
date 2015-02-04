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
    	addParallel(new ElevWithEncoder(39, .4));
    	addSequential(new WaitForTime(0.9));
    	addSequential(new DriveForDistance(10, -.5));
    	addSequential(new ClawToggle());
    	addSequential(new ClawMoveAuto(1, 1));
    	addSequential(new TurnForDegrees(-70, 0.3));
    	addSequential(new DriveForDistance(90, -.5));
    	addSequential(new ClawToggle());
    	addSequential(new ElevWithEncoder(5, .5));
    	addSequential(new ReverseDriveForDistance(1, -0.4));
    }

}
