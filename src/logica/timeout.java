package logica;
import java.util.Timer;
import java.util.TimerTask;
 
public class timeout {
 
    private int hour = 0;
    private int minute = 0;
    private int second = 00;
    private Timer timer;
    private boolean isTimerRunning;
    //private Display display;
 
    public timeout() {
        timer = new Timer();
        //display = new Display();
    }
    
    public void ponerDatos(String hora,String minuto,String segundo){
        this.hour = Integer.parseInt(minuto);
        this.minute =Integer.parseInt(segundo);
        this.second = Integer.parseInt("0");
    }
 
    TimerTask task = new TimerTask(){
        @Override
        public void run() throws IllegalStateException{
            isTimerRunning = true;
            if(second > 0) {
                second--;
            } else {
                second = 59;
                if(minute > 0) minute--;
                else {
                    minute = 59;
                    if(hour > 0) hour--;
                    // si segundo = 0, minuto = 0 y hora = 0,
                    // cancelamos el timer
                    else {
                        isTimerRunning = false;
                        timer.cancel();
                        timer.purge();
                    }
                }
            }
            if(isTimerRunning){
                System.out.println(hour+":"+minute+":"+second);
            }
            //display.printTime(hour, minute, second);
        }
    }; // fin timertask
 
    public void start(int timeout, int interval) {
        timer.schedule(task, timeout, interval);
    }
    
    public void detener(){
        this.hour = 0;
        this.minute  = 0;
        this.second =0;
    }
 
} // fin clase