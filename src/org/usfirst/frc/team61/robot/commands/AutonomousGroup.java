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
    	addSequential(new ElevWithEncoder(10, .25));
    	addSequential(new DriveForDistance(3, .5));
    	addSequential(new ClawToggle());
    	addSequential(new ClawMoveAuto(.5, 1/3));
    	addSequential(new TurnForDegrees(90, 0.3));
    	addSequential(new DriveForDistance(15, .5));
    	addSequential(new ClawToggle());
    	addSequential(new ElevWithEncoder(0, .5));
    	addSequential(new ReverseDriveForDistance(1, 0.2));
    }
}
