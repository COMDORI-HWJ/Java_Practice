package HW5;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Time {
    String hour;
    String minute;
    String second;
    String current_hour;
    String current_min;
    String current_sec;

    public Time(String h, String m, String s)
    {
        hour = h;
        minute = m;
        second = s;
    }

    void setCurrentTime()
    {
        current_hour = new SimpleDateFormat("HH").format(new Date());
        current_min = new SimpleDateFormat("mm").format(new Date());
        current_sec = new SimpleDateFormat("ss").format(new Date());
    }

    String getCurrentHour()
    {
        return current_hour;}
    String getCurrentMinute()
    {
        return current_min;}
    String getCurrentSecond()
    {
        return current_min;}
    String getHour()
    {
        return hour;}
    String getMinute()
    {
        return minute;
    }
    String getSecond()
    {
        return second;
    }

    void varyHour()
    {
        if (getHour().equals(getCurrentHour()))
            System.out.println("시간이 맞습니다.");
        else
        {
            System.out.println("시간을 " + current_hour + "시로 변경합니다.");
            hour = current_hour;
        }
    }
    void varyMinute()
    {
        if (getMinute().equals(getCurrentMinute()))
            System.out.println("분이 일치합니다.");
        else
        {
            System.out.println("분을 " + current_min + "분으로 변경합니다.");
            minute = current_min;
        }
    }
    void varySecond()
    {
        if (getSecond().equals(getCurrentSecond()))
            System.out.println("초가 일치합니다.");
        else
        {
            System.out.println("초를 " + current_sec + "초로 변경합니다.");
            second = current_sec;
        }
    }
}
