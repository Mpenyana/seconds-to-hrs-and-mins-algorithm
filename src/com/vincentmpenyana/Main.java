package com.vincentmpenyana;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(1000));
    }

    public static String getDurationString(int minutes, int seconds){
        if( minutes >= 0 && minutes < 61 || (seconds >= 0 && seconds <= 59)){
            int totalSeconds = minutes + seconds;
            int hours = totalSeconds/3600;
            return "0"+hours+ "h " + "0"+(minutes % 3600)+ "m " + (seconds % 60) +"s"
                    + " Regular Challenge Time";
        }

//        bonus question part.

        else if(minutes >= 61){
//            our base measurement here is minutes.
            int hours = seconds/3600;
//            return "These are the minutes: " + minutes % 60 + " and these are the hours " + minutes/60
//                    + " and these are the seconds " + minutes * 60;
            return "0"+(hours) + "h " + "0" +(minutes % 60) + "m "
                    + "0"+(seconds % 60) + "s "
                    + "Bonus Challenge Time";
        }

        return "Invalid value";
    }

    public static String getDurationString(int seconds){
        if(seconds >= 0){
            int minutes = seconds/60;
//            if this valuates to greater than 61, bonus part must get triggered.
            return getDurationString(minutes,seconds);
        }
        else{
            return "Invalid value";
        }
    }
}
