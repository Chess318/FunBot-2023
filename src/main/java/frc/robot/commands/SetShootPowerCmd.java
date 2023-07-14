package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Shooter;

public class SetShootPowerCmd extends CommandBase {

  //declare member variables
  private final Shooter shooterSubsystem;
  private final double speed;

  public SetShootPowerCmd(Shooter shooterSubsystem, double speed) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.shooterSubsystem = shooterSubsystem;
    this.speed = speed;
    addRequirements(shooterSubsystem);
  }


  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    //tell the shooter to move the motors
    this.shooterSubsystem.setSpeed(speed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}