/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants 
{
   public static final class CANID
   {
      public static final int powerDistPanel = 00;
      public static final int ballShooterTop = 10;
      public static final int ballShooterBottom = 11;
      public static final int driveTrainLF = 12;
      public static final int driveTrainLR = 13;
      public static final int driveTrainRF = 14;
      public static final int driveTrainRR = 15;
      public static final int ballCollector = 24;
      public static final int ballFeeder = 31;
      public static final int liftSlide = 30;
      public static final int liftRaise = 25;
      public static final int recordPlayer = 32;
      public static final int ballShooterTurret = 33;
   }

   public static final class MotorPorts
   {
      public static final int launchMotorLowerPort = 0;
      public static final int launchMotorUpperPort = 1;
      public static final int leftFrontDriveMotorPort = 2;
      public static final int leftRearDriveMotorPort = 3;
      public static final int rightFrontDriveMotorPort = 4;
      public static final int rightRearDriveMotorPort = 5;
      public static final int liftSlideMotorPort = 6;
      public static final int liftRaiseMotorPort = 7;
      public static final int recordPlayerMotorPort = 8;
      public static final int ballCollectorMotorPort = 9;
   }

   public static final class OIConstants
   {
      public static final int driver1ControlPort = 0;
      public static final int driver2ControlPort = 1;
   }

   public static final class AIPorts
   {
      public static final int stringPotHorizontalPort = 0;
      public static final int stringPotVerticalPort = 1;
   }

   public static final class POVAxis 
   {
      public static final int POVAxis = 0;
   }

   public enum GamePadAxis
   {
      leftStickX(0),
      leftStickY(1),
      leftTrigger(2),
      rightTrigger(3),
      rightStickX(4),
      rightStickY(5);
     
      

      @SuppressWarnings({"MemberName", "PMD.SingularField"})
      public final int value;

      GamePadAxis(int value)
      {
         this.value = value;
      }
   }

   public enum GamePadPOVAxis

   {
      POV(0);

      @SuppressWarnings({"MemberName", "PMD.SingularField"})
      public final int value;

      GamePadPOVAxis(int value)
      {
         this.value = value;
      }
      

   }

   public enum GamePadButtons
   {
      buttonA(1),
      buttonB(2),
      buttonX(3),
      buttonY(4),
      bumperLeft(5),
      bumperRight(6),
      back(7),
      start(8),
      leftStickPress(9),
      rightStickPress(10),
      rightStick(1),
      mode(-1),
      logitech(-1);

      @SuppressWarnings({"MemberName", "PMD.SingularField"})
      public final int value;

      GamePadButtons(int value)
      {
         this.value = value;
      }
   }

   public enum DriveDirection
   {
      normal(),
      inverted();
   }
   

   public enum LogitechProAxisButtons
   {
      frontHandleButton(1),
      lowerLeftSideHandleButton(2),
      bottomLeftHandleButton(3),
      bottomRightHandleButton(4),
      topLeftHandleButton(5),
      topRightHandleButton(6),
      topLeftBaseButton(7),
      topRightBaseButton(8),
      middleLeftBaseButton(9),
      middleRightBaseButton(10),
      bottomLeftBaseButton(11),
      bottomRightBaseButton(12);

   



      @SuppressWarnings({"MemberName", "PMD.SingularField"})
      public final int value;

      LogitechProAxisButtons(int value)
      {
         this.value = value;
      }

   }



   public enum LogitechProAxis
   {
      XAxis(0),
      YAxis(1),
      ZAxis(2);

      @SuppressWarnings({"MemberName", "PMD.SingularField"})
      public final int value;

      LogitechProAxis(int value)
      {
         this.value = value;
      }
   }

}