/**
 * Represents a simple countdown timer for the Oven.
 * Author: Nolan Runge
 */
public class Timer {

    // Instance variable
    private int seconds;

    // Constructors
    public Timer() {
        seconds = 0;
    }

    public Timer(int seconds) {
        this.seconds = seconds;
    }

    // Accessor
    public int getSeconds() {
        return seconds;
    }

    // Mutator
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    // Behavior method (no parameters)
    public void startTimer() {
        System.out.println("Timer started for " + seconds + " seconds!");
        while (seconds > 0) {
            System.out.println("Time left: " + seconds + " seconds");
            seconds--;
        }
        System.out.println("Time’s up!");
        beep(3);
    }

    // Behavior method (with parameter)
    public void beep(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("BEEP!");
        }
    }

    // toString method
    public String toString() {
        return "Timer set for " + seconds + " seconds";
    }
}
