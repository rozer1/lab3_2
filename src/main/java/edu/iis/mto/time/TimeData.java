package edu.iis.mto.time;

import org.joda.time.DateTime;

import java.time.Instant;

public class TimeData {
    //public int time = 0;

    public static DateTime getTime(int time){
        return DateTime.parse(Instant.now().plusSeconds(time).toString());
    }

    public static DateTime getTime(){
        return DateTime.parse(Instant.now().plusSeconds(0).toString());
    }
}
