package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {

    private TalonSRX intakeMotorController; 

    public Intake()
    {
        intakeMotorController = new TalonSRX(4);
    }

    public void setSpeed(double indexerSpeed)
    {
    intakeMotorController.set(ControlMode.PercentOutput, indexerSpeed);
    }
    
}
