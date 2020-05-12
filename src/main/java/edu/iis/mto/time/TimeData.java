package edu.iis.mto.time;

import org.joda.time.DateTime;

import java.time.Instant;

public class TimeData {
    DateTime time;

    public TimeData() {
        this.time = DateTime.now();
    }

    public TimeData(DateTime date){
        this.time = date;
    }

    public void changeTimeBy(int addSeconds){
        this.time = DateTime.parse(Instant.now().plusSeconds(addSeconds).toString());
    }

    public DateTime getTime() {
        return time;
    }
}
