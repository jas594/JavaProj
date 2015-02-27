/*
Asks a series of questions which are implemented into 2 methods
 */
package practice04;

import java.util.Scanner;

public class Motor {

    public double capacity, currentFuel, maxSpeed, currentSpeed, distance, efficiency;

    public void readInput2() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter fuel tank capacity: ");
        capacity = s.nextDouble();

        System.out.print("Enter amount of fuel in tank: ");
        currentFuel = s.nextDouble();

        System.out.print("Enter max speed of boat: ");
        maxSpeed = s.nextDouble();

        System.out.print("Enter current speed of boat: ");
        currentSpeed = s.nextDouble();

        System.out.print("Enter efficiency of motor: ");
        efficiency = s.nextDouble();

        System.out.print("Enter distance traveled: ");
        distance = s.nextDouble();

        System.out.println("--------------------------------");

    }

    public void writeOutput2() {
        System.out.println("\tFuel tank capacity: " + capacity);
        System.out.println("\tFuel in tank: " + currentFuel);
        System.out.println("\tMax speed: " + maxSpeed);
        System.out.println("\tCurrent speed: " + currentSpeed);
        System.out.println("\tEfficiency: " + efficiency);
        System.out.println("\tDistance: " + distance);
        System.out.println();
    }

}
