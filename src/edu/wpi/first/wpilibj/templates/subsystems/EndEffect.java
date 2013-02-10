/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.EndEffectCommand;

/**
 *
 * @author williamjf
 */
public class EndEffect extends Subsystem {
    public Jaguar elevatorMotor = new Jaguar(RobotMap.elevator);
    public Jaguar shooterMotor = new Jaguar(RobotMap.shooter);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        setDefaultCommand(new EndEffectCommand());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
