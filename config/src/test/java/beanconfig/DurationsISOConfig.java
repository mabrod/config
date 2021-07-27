package beanconfig;

import java.time.Duration;

public class DurationsISOConfig {

    Duration second;
    Duration minute;
    Duration hour;
    Duration day;
    Duration yesterday;


    public Duration getSecond() {
        return second;
    }

    public void setSecond(Duration second) {
        this.second = second;
    }

    public Duration getMinute() {
        return minute;
    }

    public void setMinute(Duration minute) {
        this.minute = minute;
    }

    public Duration getHour() {
        return hour;
    }

    public void setHour(Duration hour) {
        this.hour = hour;
    }

    public Duration getDay() {
        return day;
    }

    public void setDay(Duration day) {
        this.day = day;
    }

    public Duration getYesterday() {
        return yesterday;
    }

    public void setYesterday(Duration yesterday) {
        this.yesterday = yesterday;
    }
}
