package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Intake {

    //Variables



    private double intakeSpeed = 1;
    private double offSpeed = 0;

    private double reverseSpeed = -1;

    DcMotor intake;

    //Constructor

    public Intake(String motorName, HardwareMap hardwareMap){

        intake = hardwareMap.get(DcMotor.class, motorName);

    }


    //Methods

    public void intakeOn(){

        intake.setPower(intakeSpeed);

    }

    public void intakeOff(){

        intake.setPower(offSpeed);

    }

    public void intakeReverse(){

        intake.setPower(reverseSpeed);

    }


}
