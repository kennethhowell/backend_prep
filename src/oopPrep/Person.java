package oopPrep;

//Class: A template or blueprint for objects created from our template/blueprint
public class Person {

    public String firstName;
    public String lastName;
    public String joinsChat() {
        return lastName + ", " + firstName +" has joined the chat!";
    }

    //* * * ~ SLIDE SEVeN ~ * * *
    public static long worldPop = 7_860_000_000L;


    public static void main(String[] args) {
        //Objects: An INSTANCE utilizing the template in its creation [A Person has a firstName, this Person firstName = "Ken". A Person has a lastName, this Person lastName = "Howell"]
        Person ken = new Person(); //instantiation of the 'ken' object
        ken.firstName = "Ken"; //field - property
        ken.lastName = "Howell"; //field - property
        System.out.println("ken = " + ken);
        System.out.println(ken.firstName + " " + ken.lastName + " is my name!");
        System.out.println(ken.joinsChat());

        //* * * ~ SLIDE SEVeN ~ * * *
        System.out.println(worldPop); //Looks pretty good! We're accessing the class property here!
        Person douglas = new Person(); //Douglas let me know we forgot to include him in the count, woops - let's rectify that
        douglas.firstName = "Douglas";
        douglas.lastName = "Hirsh";

        Person.worldPop += 1; //updating our class property with our new person
        System.out.println(worldPop); //There it is! 7860000001
        System.out.println(douglas.worldPop); //we CAN do this, but not a good idea unless you have a specific reason to do so

//        System.out.println(Person.firstName); //red X here too - each individual PERSON has a different name, not the entire class (Person) in general

    }
}
