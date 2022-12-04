// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;




import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;


import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ExampleSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */

  //normal drive motors 
  private final CANSparkMax rightAlpha, leftAlpha, rightBeta, leftBeta; 
  MotorControllerGroup leftMotors;
  MotorControllerGroup rightMotors;
  
  //swerve motors 

 

  DifferentialDrive robot;

  public ExampleSubsystem() {
    rightAlpha = new CANSparkMax(Constants.RIGHT_ALPHA_DRIVE, MotorType.kBrushless);
    rightAlpha.restoreFactoryDefaults();
    rightAlpha.setInverted(false);
    rightAlpha.setIdleMode(IdleMode.kBrake);
    rightAlpha.setClosedLoopRampRate(Constants.CLOSED_LOOP_RAMP_RATE);
    rightAlpha.setOpenLoopRampRate(Constants.OPEN_LOOP_RAMP_RATE);
    leftAlpha = new CANSparkMax(Constants.LEFT_ALPHA_DRIVE, MotorType.kBrushless);
    leftAlpha.restoreFactoryDefaults();
    leftAlpha.setInverted(false);
    leftAlpha.setIdleMode(IdleMode.kBrake);
    leftAlpha.setClosedLoopRampRate(Constants.CLOSED_LOOP_RAMP_RATE);
    leftAlpha.setOpenLoopRampRate(Constants.OPEN_LOOP_RAMP_RATE);
    //beta motors 
    rightBeta = new CANSparkMax(Constants.RIGHT_BETA_DRIVE, MotorType.kBrushless);
    rightBeta.restoreFactoryDefaults();
    rightBeta.setInverted(false);
    rightBeta.setIdleMode(IdleMode.kBrake);
    rightBeta.follow(rightAlpha);
    leftBeta = new CANSparkMax(Constants.LEFT_BETA_DRIVE, MotorType.kBrushless);
    leftBeta.restoreFactoryDefaults();
    leftBeta.setInverted(false);
    leftBeta.setIdleMode(IdleMode.kBrake);
    leftBeta.follow(leftAlpha);

    //swerve motors(gotta make it work cuz shit cost like 4000000 dollars)
    
    
    leftMotors = new MotorControllerGroup(leftAlpha, leftBeta);
    rightMotors = new MotorControllerGroup(rightAlpha, rightBeta);
    robot = new DifferentialDrive(leftMotors, rightMotors);

  }


  public void curvatureDrive(XboxController controller, double speed){
    //drive with both triggers and left joystick 
    double xSpeed = controller.getRawAxis(Constants.XBOX_RIGHT_TRIGGER)-controller.getRawAxis(Constants.XBOX_LEFT_TRIGGER);
    double zRotation = controller.getRawAxis(Constants.XBOX_LEFT_X_AXIS);
    boolean isQuickTurn = true; 
    robot.curvatureDrive(xSpeed*speed, zRotation*speed, isQuickTurn);
  }


  

  
  @Override
  public void periodic() {
    // This method will be called once per scheduler 
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
