package com.example.servotester;

public class DurationThing {

    public static double setDuration(double ang){
        double time;
        if(ang<0) ang=-ang;
        //if(ang==0) return time=0.5;
        return time= (int)(ang*0.012);
    }

    public static double setDuration2(double ang, double sec){
        double time;
        if(ang<0) ang=-ang;
        if(ang==0) return time= sec;
        return time= (int)(ang/60*0.012);
    }

}
