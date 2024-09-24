package A2409Sep2024.Class08;

public class DateDemo {
    private long time;
    public DateDemo(){
        this.time=System.currentTimeMillis();
    }
    public DateDemo(long time){
        this.time = time;
    }
    public long getTime(){
        return time;
    }
    public void setTime(long time){
        this.time = time;
    }
}
