package com.example.servotester;

public class DurationThing {

    public static double setDur(double ang, double lastAng, double speed){
        double time;
        if(ang<0) ang= -ang;
        if(lastAng==ang || -lastAng==ang) return time= (int)(1.25*ang*speed);
        else if(ang==0){
            if(lastAng<0) lastAng= -lastAng;
            return time= (int)(lastAng*speed);
        }
        else return time= (int)(ang*speed);
    }
//    public static double setDuration(double ang, double lastAng, double speed){
//        double time;
//        if(ang<0) ang=-ang;
//        if(lastAng==ang || -lastAng==ang) return time= (int)(1.5*ang*speed);
//        //if(ang==0) return time=0.5;
//            else return time= (int)(ang*speed);
//    }
//
//    public static double setDurationForZero(double lastAng, /*double ang, double sec,*/ double speed){            //doar daca angle=0
//        double time;
////        if(ang<0) ang=-ang;
//        if(lastAng<0) lastAng=-lastAng;
        ////        if(ang==0) return time= sec;
        ////        if(ang==0) return time= (int)lastAng*speed;
//        return time= (int)(lastAng*speed);
//    }

}
