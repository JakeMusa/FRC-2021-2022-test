// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Index extends SubsystemBase {

  VictorSP indexMotor;
  VictorSP plateMotor;
  
  /** Creates a new Index. */
  public Index() {
    indexMotor = new VictorSP(2);
    plateMotor = new VictorSP(0);

  }


  public void indexBall(double speed){
    indexMotor.set(-speed);
}
//spin index plate
public void spinPlate(double speed){
    plateMotor.set(speed);
    
}

public void stopIndex(){
  indexMotor.set(0);
  plateMotor.set(0);
}

  @Override
  public void periodic() {

    
    // This method will be called once per scheduler run
  }
}
