Oven Simulation Project
Project Description: This project simulates how an oven works using objects. It includes features such as baking, broiling, opening the oven door, and using a countdown timer. When the program runs, the user can see the oven change its states and perform actions such as starting or stopping cooking. The goal of this project is to model a real appliance using classes, objects, constructors, methods, and interactions between objects.

Features:

Bake and broil functions with adjustable temperatures
Ability to open and close the oven door
Safety behavior that prevents cooking if the door is open
Countdown timer that prints the remaining time
The timer beeps when it reaches zero
Overloaded constructors for initialization options
Full toString() methods for easy status printing
A tester class that runs a demonstration of all major behaviors

How the Code Works:
Main Classes
1. Oven

The Oven class represents a real oven and contains:
State variables (bake on/off, broil on/off, door open, temperatures, brand)
A Timer object (composition)
Constructors to create a default or customized oven
Methods that turn baking/broiling on or off, open/close the door, set the timer, start or stop cooking
A toString() method that prints the oven’s current status
Key behaviors:
startCooking() only works if the door is closed and at least one heating method (bake or broil) is active.
The oven automatically uses the Timer object to count down.

2. Timer

The Timer class represents a simple countdown timer.
It includes:
An integer seconds variable
Methods to set or get the time
A loop in startTimer() that counts down to zero
A beep(int times) method called when the timer finishes
A toString() method that reports the time remaining

3. OvenTester

This class contains the main method and demonstrates:
Creating ovens using both constructors
Printing oven status
Turning bake on
Starting the cooking process
Stopping the oven
How the Classes Interact
The Oven contains a Timer → This is composition.
The Oven controls when the timer starts by calling timer.startTimer().
The Timer performs the countdown and beeps when done.
Use of OOP
Encapsulation: private fields with public getters/setters
Method overloading: constructors in both Oven and Timer
Object composition: Oven contains a Timer object
Behavioral methods: simulate real-world appliance actions

How to Run the Program
Make sure all three files are in the same folder of src:

Oven.java
Timer.java
OvenTester.java

Compile the files:

javac *.java
Run the tester:
java OvenTester


You should see:

Oven status printed
Bake turning ON
Cooking starting
Timer counting down
Beeps when time is up

Development Process

Throughout this project, the main goals were to use:

Multiple classes
Constructors (default and overloaded)
Object interaction between classes
Behavior methods with and without parameters
Challenges included managing safety conditions (like a closed door), preventing invalid cooking states, and ensuring the timer counted down correctly. If more time were available, improvements could include adding a preheat mode, temperature validation, or user input via Scanner.

Author Information

Authors: Co-pilot and Nolan Runge
What I learned:
During this project, I learned how objects interact with one another, how to design multiple constructors, and how to model real-world behavior in code. I also gained experience organizing code into separate classes and using a tester class to run demonstrations.


Class Diagram:

classDiagram
    class Oven {
        - boolean bakeOn
        - boolean broilOn
        - boolean doorOpen
        - int bakeTemp
        - int broilTemp
        - String brand
        - Timer timer
        + Oven()
        + Oven(String brand, int bakeTemp, int broilTemp, int timerSeconds)
        + boolean isBakeOn()
        + boolean isBroilOn()
        + boolean isDoorOpen()
        + int getBakeTemp()
        + int getBroilTemp()
        + String getBrand()
        + Timer getTimer()
        + void setBake(boolean on, int temperature)
        + void setBroil(boolean on, int temperature)
        + void setDoorOpen(boolean open)
        + void setBrand(String brand)
        + void setTimerSeconds(int seconds)
        + void startCooking()
        + void stopCooking()
        + String toString()
    }

    class Timer {
        - int seconds
        + Timer()
        + Timer(int seconds)
        + int getSeconds()
        + void setSeconds(int seconds)
        + void startTimer()
        + void beep(int times)
        + String toString()
    }

    class OvenTester {
        + main(String[] args)
    }

    Oven --> Timer : has-a
    OvenTester --> Oven : uses
    OvenTester --> Timer : uses indirectly
