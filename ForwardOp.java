package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by ROBOTICS04 on 10/31/2017.
 */

@TeleOp(name = "Op")
public class ForwardOp extends OpMode {

    //data_type var_name;
    public static final double SPEED = 0.6;
    DcMotor left;
    DcMotor right;

    @Override
    public void init () {
        left = hardwareMap.dcMotor.get("left");
        right = hardwareMap.dcMotor.get("right");
    }
    @Override
    public void loop () {
        left.setPower(-gamepad1.left_stick_y*SPEED);
        right.setPower(-gamepad1.right_stick_y*SPEED);
    }
}

