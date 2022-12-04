// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final int RIGHT_ALPHA_DRIVE = 1;
    public static final int LEFT_ALPHA_DRIVE = 2;
    public static final int RIGHT_BETA_DRIVE = 3; 
    public static final int LEFT_BETA_DRIVE = 4; 
    public static final int RIGHT_SHOOT = 5;
    public static final int LEFT_SHOOT = 6;
    public static final int PLATE_MOTOR = 0;
    public static final int INTAKE_MOTOR = 1;
    public static final int INDEX_MOTOR =2;
    public static final int LIFT_PIVOT = 4; 
    public static final int RIGHT_LIFT = 3; 
    public static final int INDEX_WALL = 5;
    public static final int LEFT_LIFT = 6;



    public static final double CLOSED_LOOP_RAMP_RATE = 0.75; 
    public static final double OPEN_LOOP_RAMP_RATE = 0.75; 
    public static final double SHOOT_RAMP = 1.75;


    public static final int XBOX_LEFT_Y_AXIS = 1;
    public static final int XBOX_LEFT_X_AXIS = 0;
    public static final int XBOX_RIGHT_Y_AXIS = 5;
    public static final int XBOX_RIGHT_TRIGGER = 3;
    public static final int XBOX_LEFT_TRIGGER = 2;
    public static final int DRIVER_ONE = 1;
    public static final int DRIVER_TWO = 2; 


    public static final double DRIVESPEED = 0.5;
    public static final double INDEX_SPEED = 0.5;
    public static final double PLATE_SPEED = 0.65;
    public static final double CLIMB_SPEED = 0.5; 
    public static final double PIVOT_SPEED = 0.2; 
    //shooter constants 
    public static final double SHOOT_SPEED = -0.79;
    //intake/index constants
    public static final double INTAKE_SPEED = -1;
    public static final double OPEN_SPEED = 0.3; 
    public static final double CLOSE_SPEED = -0.2; 
    public static final double CLOSE_TIME = 0.3; 

    
}
