/**
 * Tests the Oven and Timer classes.
 * Author: Nolan Runge
 */
public class OvenTester {
    public static void main(String[] args) {
        // Create an oven using the default constructor
        Oven oven1 = new Oven();
        System.out.println(oven1);

        // Create an oven using the overloaded constructor
        Oven oven2 = new Oven("KitchenAid", 350, 500, 5);
        System.out.println(oven2);

        // Call a behavior method with parameters
        oven2.setBake(true, 375);

        // Call a behavior method without parameters
        oven2.startCooking();

        // Stop the oven
        oven2.stopCooking();
    }
}
