public class Time {
    public int hour;
    public int minute;
    public int second;

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString() {
    return  String.format("%d%d:%d%d:%d%d", (hour/10), (hour%10), (minute/10), (minute%10), (second/10), (second%10));
    }

    public Time nextSecond() {
        if (second == 59) {
            second = 0;
            if (minute == 59) {
                minute = 0;
                if (hour == 23) {
                    hour = 0;
                } else {
                    hour++;
                }
            } else {
                minute++;
            }
        } else {
            second++;
        }
        
    }

    public Time previousSecond(){

    }




}
