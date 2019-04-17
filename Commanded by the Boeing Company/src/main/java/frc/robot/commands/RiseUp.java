/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
// import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.Robot;

public class RiseUp extends Command {
  public RiseUp() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.m_fk);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    System.out.println("Wanna buy this crowbar bro??");
    // Robot.m_fk.fk.set(-6);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    System.out.println(!Robot.m_fk.m_raiseTo.get());
    return !Robot.m_fk.m_raiseTo.get();
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    System.out.println("done");
    FkCommand throwback = new FkCommand();
    throwback.start();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}