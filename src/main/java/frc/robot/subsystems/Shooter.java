// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
  /** Creates a new Shooter. */

        public final CANSparkMax leftShooter; 
        public final CANSparkMax rightShooter;  
        
  public Shooter() {
    leftShooter = new CANSparkMax(6, MotorType.kBrushless);
    leftShooter.restoreFactoryDefaults();
    leftShooter.setInverted(true);
    leftShooter.setIdleMode(IdleMode.kCoast);
    leftShooter.setClosedLoopRampRate(0.75);
    leftShooter.setOpenLoopRampRate(0.75);


    rightShooter = new CANSparkMax(5, MotorType.kBrushless);
    rightShooter.restoreFactoryDefaults();
    rightShooter.setInverted(false);
    rightShooter.setIdleMode(IdleMode.kCoast);
     rightShooter.setClosedLoopRampRate(0.75);
    rightShooter.setOpenLoopRampRate(0.75);
    
  }

  public void shootBall(double speed){
    leftShooter.set(speed);
    rightShooter.set(speed);
  }
  public void stop(){
    leftShooter.set(0);
    rightShooter.set(0);
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
