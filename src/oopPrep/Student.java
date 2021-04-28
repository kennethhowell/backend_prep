package oopPrep;

public class Student {
    public String name;
    public String cohort;

    //Constructors : special methods called when creating an object
    public Student(String studentName){
        name = studentName;
        cohort = "Unassigned";
    }

    //We can overload these methods too! Above: A constructor for students we only have the name of
    //Below: A constructor for students we have the name of and have an assigned cohort
    public Student(String studentName, String assignedCohort){
        name = studentName;
        cohort = assignedCohort;
    }

    public static void main(String[] args) {
        //Name + Cohort available and passed as arugments
        Student nathan = new Student("Nathan Adcock", "Marco");
        System.out.println(nathan.name + " - " + nathan.cohort);

        //Name available and passed as the only argument
        Student nateDogg = new Student ("Nate Dogg");
        System.out.println(nateDogg.name + " - " + nateDogg.cohort);
    }

}
