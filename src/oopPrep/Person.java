package oopPrep;

//Class: A template or blueprint for objects created from our template/blueprint
public class Person {
    public String firstName;
    public String lastName;
    public String joinsChat() {
        return lastName + ", " + firstName +" has joined the chat!";
    }

    public static void main(String[] args) {
        //Objects: An INSTANCE utilizing the template in its creation [A Person has a firstName, this Person firstName = "Ken". A Person has a lastName, this Person lastName = "Howell"]
        Person ken = new Person(); //instantiation of the 'ken' object
        ken.firstName = "Ken"; //field - property
        ken.lastName = "Howell"; //field - property
        System.out.println("ken = " + ken);
        System.out.println(ken.firstName + " " + ken.lastName + " is my name!");
        System.out.println(ken.joinsChat());
    }
}
