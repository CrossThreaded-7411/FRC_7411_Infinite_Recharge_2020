/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.EnergyLaunchSubsystem;
import frc.robot.commands.LaunchEnergyCommand;
import frc.robot.Constants.*;
// import frc.wpi.first.wpi.command.XboxController;
// import frc.robot.Constants.GamePadButtons;
// import frc.robot.Constants.OIConstants;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer
{
  // The robot's subsystems and commands are defined here...
  private final EnergyLaunchSubsystem m_energyLaunchSubsystem = new EnergyLaunchSubsystem();
//   private final LaunchEnergyCommand m_launchEnergyCommand = new LaunchEnergyCommand(m_energyLaunchSubsystem, 0.0);

  // Create driver controller
  Joystick m_driver1Joystick = new Joystick(OIConstants.driver1ControlPort);

  // Create joystic button objects
//   JoystickButton launchButton = new JoystickButton(m_driver1Joystick, GamePadButtons.buttonA.value);

  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer()
  {
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings()
  {
      // Bind controller buttons to commands
      new JoystickButton(m_driver1Joystick, GamePadButtons.back.value).whenPressed(new LaunchEnergyCommand(m_energyLaunchSubsystem, 0.0));
      new JoystickButton(m_driver1Joystick, GamePadButtons.buttonY.value).whenPressed(new LaunchEnergyCommand(m_energyLaunchSubsystem, 0.7));
      new JoystickButton(m_driver1Joystick, GamePadButtons.buttonB.value).whenPressed(new LaunchEnergyCommand(m_energyLaunchSubsystem, 0.8));
      new JoystickButton(m_driver1Joystick, GamePadButtons.buttonA.value).whenPressed(new LaunchEnergyCommand(m_energyLaunchSubsystem, 0.9));
      new JoystickButton(m_driver1Joystick, GamePadButtons.buttonX.value).whenPressed(new LaunchEnergyCommand(m_energyLaunchSubsystem, 1.0));
  }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand()
  {
    // An ExampleCommand will run in autonomous
    return null; //m_autoCommand;
  }
}