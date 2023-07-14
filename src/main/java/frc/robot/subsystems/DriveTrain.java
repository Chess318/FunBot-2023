
package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;



public class DriveTrain extends SubsystemBase {
  private static TalonSRX leftFrontMotorController;
  private static TalonSRX rightFrontMotorController;
  private static TalonSRX leftBackMotorController;
  private static TalonSRX rightBackMotorController;


  public DriveTrain() {

    //set motor contoller IDs
    leftFrontMotorController = new TalonSRX(0);
    rightFrontMotorController = new TalonSRX(1);
    leftBackMotorController = new TalonSRX(2);
    rightBackMotorController = new TalonSRX(3);

    //set motor controllers to follow leaders
    leftBackMotorController.follow(leftFrontMotorController);
    rightBackMotorController.follow(rightFrontMotorController);


  }

  
  public void setMotors(double leftSpeed, double rightSpeed)
  {
    leftFrontMotorController.set(ControlMode.PercentOutput, leftSpeed);
    rightFrontMotorController.set(ControlMode.PercentOutput, rightSpeed);
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
