/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved. */
/* Open Source Software - may be modified and shared by FRC teams. The code */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project. */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.CANID;

public class BallTurretSubsystem extends SubsystemBase
{
   private TalonSRX turretMotor = new TalonSRX(CANID.ballShooterTurret);

   /**
    * Creates a new DriveSubsystem.
    */
   public BallTurretSubsystem()
   {
      turretMotor.configSelectedFeedbackSensor(FeedbackDevice.PulseWidthEncodedPosition, 1, 10);
      // Constructor
      stopMotor();
   }

   /**
    * Sets motor power for the ball launcher motor
    * 
    * @param targetPower Accepts a power level between -1 to 1
    */
   public void setMotorPower(double power)
   {
      turretMotor.set(ControlMode.PercentOutput, power);
   }

   /**
    * Stops the motor by setting power to 0.0
    */
   public void stopMotor()
   {
      turretMotor.set(ControlMode.PercentOutput, 0.0);
   }

   public void displayTurretPosition()
   {
      System.out.println("Turrent Counts: " + turretMotor.getSelectedSensorPosition());
   }
}