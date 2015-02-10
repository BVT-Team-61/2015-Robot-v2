package org.usfirst.frc.team61.robot.subsystems;

import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ComPort extends Subsystem {

	private static SerialPort com = new SerialPort(9600, SerialPort.Port.kOnboard);
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void sendString( Object data ){
    	String str = data.toString();
    	com.writeString(str);
    } 
    public void sendString( String data ){
    	com.writeString(data);
    }
}

