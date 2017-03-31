// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc253.Code2017.subsystems;

import org.usfirst.frc253.Code2017.RobotMap;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Ultrasonic;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class SensorData extends Subsystem {
	
	//Declares sensors, connects to RobotMap
    public final Ultrasonic ultraLeft = RobotMap.sensorDataUltrasonic1;
    public final Ultrasonic ultraRight = RobotMap.sensorDataUltrasonic2;
    public final AnalogGyro gyro = RobotMap.sensorDataGyroscope1;
    public final DigitalInput photo = RobotMap.sensorDataPhoto1;

    public void initDefaultCommand() {}
}

