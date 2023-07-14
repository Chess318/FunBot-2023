package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Indexer extends SubsystemBase {

    private TalonSRX indexerMotorController; 

    public Indexer()
    {
        indexerMotorController = new TalonSRX(4);
    }

    public void setSpeed(double indexerSpeed)
    {
    indexerMotorController.set(ControlMode.PercentOutput, indexerSpeed);
    }
    
}
