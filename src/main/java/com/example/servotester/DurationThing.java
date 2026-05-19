package com.example.servotester;

public class DurationThing {

    public static double setDuration(double ang, double speed){
        double time;
        if(ang<0) ang=-ang;
        //if(ang==0) return time=0.5;
        return time= (int)(ang*speed);
    }

    public static double setDurationForZero(double lastAng, /*double ang, double sec,*/ double speed){            //doar daca angle=0
        double time;
//        if(ang<0) ang=-ang;
        if(lastAng<0) lastAng=-lastAng;
//        if(ang==0) return time= sec; //... :(
//        if(ang==0) return time= (int)lastAng*speed;
        return time= (int)(lastAng*speed);
    }

}
