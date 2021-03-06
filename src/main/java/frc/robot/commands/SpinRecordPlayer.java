/*---------------------------------------------------------------------------
   FRC Team CrossThreaded #7411
   Valley Lutheran School, Cedar Falls, IA
   Open Source Software - may be modified and shared by all.
  ---------------------------------------------------------------------------*/
package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.RecordPlayerSubsystem;
import frc.robot.Robot;
import frc.robot.Constants;


// A command to turn on the launch motor to a known desired power
public class SpinRecordPlayer extends CommandBase
{
   private final RecordPlayerSubsystem powerRecordPlayer;

   // Constructor
   public SpinRecordPlayer(RecordPlayerSubsystem subsystem)
   {
      powerRecordPlayer = subsystem;
      addRequirements(subsystem);
   }


   // Start up command by assuring that motors are turned off
   @Override
   public void initialize()
   {
      powerRecordPlayer.stopMotor();
   }


   // Runtime operation of the record player by sing the right and left joystick triggers on driver
   // 2 controller
   @Override
   public void execute()
   {
      double leftTrigger = Robot.m_robotContainer.driver2Controller.getRawAxis(Constants.GamePadAxis.rightTrigger.value);
      double rightTrigger = Robot.m_robotContainer.driver2Controller.getRawAxis(Constants.GamePadAxis.leftTrigger.value);
      double deadband = 0.05;
      double power = 0.0;

      if (leftTrigger >= deadband)
      {
         power = -leftTrigger;
      }
      else if (rightTrigger >= deadband)
      {
         power = rightTrigger;
      }
      else
      {
         power = 0.0;
      }

      // Setting motor power proportional to joystick trigger position
      powerRecordPlayer.setRecordPlayerPower(power);
   }


   // This command should remain active through the entire competition so isFinished is False
   @Override
   public boolean isFinished()
   {
      return false;
   }
}
