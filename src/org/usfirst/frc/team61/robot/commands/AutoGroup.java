package org.usfirst.frc.team61.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc.team61.robot.subsystems.ToggleSwitch;

public class AutoGroup extends CommandGroup {
public ToggleSwitch toggleswitch = new ToggleSwitch();
	public AutoGroup(){
		addSequential(new ClawOpen());
		if(toggleswitch.getSwitchA()){
			if(toggleswitch.getSwitchB()){
				addSequential(new AutoThreeTote());
			}else{
				addSequential(new AutoOneTote());
			}
		}else{
			if(toggleswitch.getSwitchB()){
				addSequential(new AutoTwoTote());
			}else{
				addSequential(new AutoNull());
			}
		}
	}
}
