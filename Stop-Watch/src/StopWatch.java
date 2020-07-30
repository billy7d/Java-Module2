import java.time.LocalTime;

public class StopWatch {

    private double startTime;
    private double endTime;

    public LocalTime startTime(){
        return java.time.LocalTime.now();
    }

    public void start(){
        startTime = java.time.LocalTime.now();

    }


}
