/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author williamjf
 */
public class EndEffectCommand extends CommandBase {
    
    public EndEffectCommand() {
        requires(endEffect);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        CommandBase.endEffect.elevatorMotor.set(CommandBase.oi.controller.getRawAxis(RobotMap.triggers));
        if(CommandBase.oi.controller.getRawButton(RobotMap.shootButton)){
            CommandBase.endEffect.shooterMotor.set(1);
        }
        else{
            CommandBase.endEffect.shooterMotor.set(0);
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
