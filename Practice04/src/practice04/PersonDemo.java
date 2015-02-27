/*
Creates 5 new objects and reads the methods from person.java
 */
package practice04;

public class PersonDemo {

    public static void main(String[] args) {

        Person personOne = new Person();
        personOne.readInput();
        personOne.writeOutput();
        
        Person personTwo = new Person();
        personTwo.readInput();
        personTwo.writeOutput();

        Person personThree = new Person();
        personThree.readInput();
        personThree.writeOutput();

        Person personFour = new Person();
        personFour.readInput();
        personFour.writeOutput();

        Person personFive = new Person();
        personFive.readInput();
        personFive.writeOutput();
        
        personOne.writeOutput();
        personTwo.writeOutput();
        personThree.writeOutput();
        personFour.writeOutput();
        personFive.writeOutput();

    }
}
