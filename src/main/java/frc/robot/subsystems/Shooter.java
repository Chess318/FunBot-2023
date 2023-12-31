package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {

    private CANSparkMax shooterMotorController; 
    private RelativeEncoder encoder; 

    public Shooter()
    {
        shooterMotorController = new CANSparkMax(5, MotorType.kBrushless);
        encoder = shooterMotorController.getEncoder(); 
    }

    public void setSpeed(double indexerSpeed)
    {
        shooterMotorController.set(indexerSpeed);
    }
    
}
