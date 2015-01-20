/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc.team61.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 * @author FrankAdmin
 */
public class AutonomousGroup extends CommandGroup {
    
    public AutonomousGroup() {        
        //addSequential(new ReverseDriveForDistance(10, 0.2));
    	addSequential(new ElevWithEncoder(.5,1.1));
    	addSequential(new DriveForDistance(3,.5 ));
    	addSequential(new ClawToggle());
    	
    }
}
