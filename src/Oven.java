/**
 * Author: Co-pilot and Nolan Runge
 * Represents an Oven with bake, broil, and timer functions.
 */
public class Oven {

    // Instance variables
    private boolean bakeOn;
    private boolean broilOn;
    private boolean doorOpen;
    private int bakeTemp;
    private int broilTemp;
    private String brand;
    private Timer timer; // Secondary class object

    // Constructors
    public Oven() {
        brand = "Generic";
        bakeOn = false;
        broilOn = false;
        doorOpen = false;
        bakeTemp = 0;
        broilTemp = 0;
        timer = new Timer();
    }

    public Oven(String brand, int bakeTemp, int broilTemp, int timerSeconds) {
        this.brand = brand;
        this.bakeTemp = bakeTemp;
        this.broilTemp = broilTemp;
        bakeOn = false;
        broilOn = false;
        doorOpen = false;
        timer = new Timer(timerSeconds);
    }

    // Accessors (getters)
    public boolean isBakeOn() { return bakeOn; }
    public boolean isBroilOn() { return broilOn; }
    public boolean isDoorOpen() { return doorOpen; }
    public int getBakeTemp() { return bakeTemp; }
    public int getBroilTemp() { return broilTemp; }
    public String getBrand() { return brand; }
    public Timer getTimer() { return timer; }

    // Mutators (setters)
    public void setBake(boolean on, int temperature) {
        bakeOn = on;
        bakeTemp = on ? temperature : 0;
        System.out.println("Bake " + (on ? "ON at " + bakeTemp + "°F." : "OFF."));
    }

    public void setBroil(boolean on, int temperature) {
        broilOn = on;
        broilTemp = on ? temperature : 0;
        System.out.println("Broil " + (on ? "ON at " + broilTemp + "°F." : "OFF."));
    }

    public void setDoorOpen(boolean open) {
        doorOpen = open;
        System.out.println(open ? "Door opened. Heat off for safety!" : "Door closed. Oven ready.");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setTimerSeconds(int seconds) {
        timer.setSeconds(seconds);
        System.out.println("Timer set for " + seconds + " seconds.");
    }

    // Behavior methods
    public void startCooking() {
        if (!doorOpen && (bakeOn || broilOn)) {
            System.out.println("Cooking started!");
            timer.startTimer();
        } else {
            System.out.println("Cannot start cooking — check door or settings!");
        }
    }

    public void stopCooking() {
        bakeOn = false;
        broilOn = false;
        System.out.println("Oven stopped.");
    }

    // toString method
    public String toString() {
        return "Oven [" + brand + "] - Bake: " + bakeOn + " (" + bakeTemp + "°F), Broil: " + broilOn + 
               " (" + broilTemp + "°F), Door open: " + doorOpen + ", " + timer.toString();
    }
}
