// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.ExampleCommand;
import frc.robot.commands.IndexBall;
import frc.robot.commands.ShootBall;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.Index;
import frc.robot.subsystems.Shooter;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {


  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem driveTrain;
  private final Shooter shooter; 
  private final ShootBall shootBall; 
  private final ExampleCommand curveDrive;
  public static XboxController driver;
  private final Index index; 
  private final IndexBall indexBall; 


  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {

    driveTrain = new ExampleSubsystem();

   
    curveDrive = new ExampleCommand(driveTrain);
    driveTrain.setDefaultCommand(curveDrive);
    curveDrive.addRequirements(driveTrain);


    driver = new XboxController(Constants.DRIVER_ONE);

   

    shooter = new Shooter(); 
    shootBall = new ShootBall(shooter);
    shootBall.addRequirements(shooter);




    index = new Index();
    indexBall = new IndexBall(index);
    indexBall.addRequirements(index);
    // Configure the button bindings
    configureButtonBindings();


  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
     
      JoystickButton shoot = new JoystickButton(driver, XboxController.Button.kX.value);
      shoot.toggleWhenPressed(new ShootBall(shooter)); 
      
      JoystickButton indexBall = new JoystickButton(driver, XboxController.Button.kY.value);
      indexBall.whileHeld(new IndexBall(index)); 

    


  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return curveDrive;
  }
}
