/*
Creates 5 new objects and reads the methods from motor.java
 */
package practice04;

public class MotorDemo {

    public static void main(String[] args) {

        Motor boatOne = new Motor();
        boatOne.readInput2();
        boatOne.writeOutput2();

        Motor boatTwo = new Motor();
        boatTwo.readInput2();
        boatTwo.writeOutput2();

        Motor boatThree = new Motor();
        boatThree.readInput2();
        boatThree.writeOutput2();

        Motor boatFour = new Motor();
        boatFour.readInput2();
        boatFour.writeOutput2();

        Motor boatFive = new Motor();
        boatFive.readInput2();
        boatFive.writeOutput2();
        
        boatOne.writeOutput2();
        boatTwo.writeOutput2();
        boatThree.writeOutput2();
        boatFour.writeOutput2();
        boatFive.writeOutput2();

    }
}
