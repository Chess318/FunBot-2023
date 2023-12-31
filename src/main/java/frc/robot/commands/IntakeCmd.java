package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake;

//runs intake at a given speed, can be forward of backward depending on whether the speed is positive or negative

public class IntakeCmd extends CommandBase {

    private final Intake intakeSubsystem;
    private final double speed;

    public IntakeCmd(Intake intakeSubsystem, double speed) {
        this.intakeSubsystem = intakeSubsystem;
        this.speed = speed;
        addRequirements(intakeSubsystem);
    }

    @Override
    public void initialize() {
        System.out.println("Intake cmd started!");
    }

    @Override
    public void execute() {
        this.intakeSubsystem.setSpeed(speed);
    }

    @Override
    public void end(boolean interrupted) {
        System.out.println("Intake cmd ended!");
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}