
/**
 * Write a description of class ClockTime here.
 *
 * @author Cristian Mendez
 * @version (a version number or a date)
 */
public class ClockTime
{
    // instance variables - replace the example below with your own
    private int h;
    private int m;
    private int s;

    /**
     * Constructor for objects of class ClockTime
     */
    public ClockTime()
    {
        // initialise instance variables
        h=0;
        m=0;
        s=0;
    }
    //constructors
    public ClockTime(int hour, int minute, int second)
    {
        int temp = 0;
        s=second;
        m=minute;
        h=hour;
        //checking if seconds valid
        if (second>59){
            s=second%60;
            temp=second/60;
            minute=minute+temp;
        }
        if (second<0){
            second = 0;
        }
        temp=0;
        //checking if minutes valid
        if(minute>59){
            m=minute%60;
            temp=minute/60;
            hour=hour+temp;
        }
        if(minute<0){
            minute=0;
        }
        temp=0;
        //checking if hours valid
        if(hour>24){
            h=hour%24;
            h=hour+temp;
        }
        h=hour+temp;
        if(hour<0){
            hour=0;
        }
    }
    //Instance Getter Methods
    public int getHour(){
        return h;
    }
    public int getMinute(){
        return m;
    }
    public int getSecond(){
        return s;
    }
    //Instance Setter Methods
    public void setHour(int hour){
        //checking if Hours valid
        if(hour>24){
            h=hour%24;
        }
        if(hour<0){
            hour=0;
        }
        h=hour;
    }
    public void setMinute(int minute){
        //checking if Minutes valid
        if(minute>59){
            m=minute%60;
        }
        if(minute<0){
            minute=0;
        }
        m=minute;
    }
    public void setSecond(int second){
        //checking if Seconds valid
        if (second>59){
            s=second%60;
        }
        if (second<0){
            second = 0;
        }
        s=second;
    }
    //Methods that create Strings
    public String toString(){
        //Converting to strings then concatenating them together
        String a = String.format("%02d",h);
        String ab = String.format(":");
        String b = String.format("%02d",m);
        String bc = String.format(":");
        String c = String.format("%02d",s);
        String d = a+ab+b+bc+c;
        return d;
    }
    public String toString12(){
        //created place holder for hour as to not affect our private variable
        int hour = h;
        //checking if Hour is over 12 if it is subtracting 12 to keep it in 12-hour format
        if(hour>12){
            hour=h-12;
        }
        String a = String.format("%02d",hour);
        String ab = String.format(":");
        String b = String.format("%02d",m);
        String bc = String.format(":");
        String c = String.format("%02d",s);
        String d = String.format(" P.M.");
        String f = String.format(" A.M.");
        String g=a;
        if(h>=12)
            g = a+ab+b+bc+c+d;
        if(h<12)
            g = a+ab+b+bc+c+f;
        return g;
    }    
    //Methods to calculate and compare
    public void advance(int a){
        //initiating variables to hold values as to not affect private variables
        int hour=0;
        int minute=0;
        int second=s+a;
        if(second>60){
            minute=second/60;
            s=second%60;
        }
        m=m+minute;
        if(m>60){
            hour=m/60;
            m=m%60;
        }
        h=h+hour;
        if(h>24){
            h=hour%24;
        }
    }
    public boolean equals(ClockTime x){
        //checking all values of object and if they are the same returning true else false
        if((this.getHour()==x.getHour())&&(this.getMinute()==x.getMinute())&&(this.getSecond()==x.getSecond())){
            return true;
        }
        else{
            return false;
        }
    }
}
