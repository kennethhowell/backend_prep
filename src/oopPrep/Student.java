package oopPrep;

public class Student {
//    public String name;
//    public String cohort;

    //Constructors : special methods called when creating an object
//    public Student(String studentName){
//        name = studentName;
//        cohort = "Unassigned";
//    }
//
//    //We can overload these methods too! Above: A constructor for students we only have the name of
//    //Below: A constructor for students we have the name of and have an assigned cohort
//    public Student(String studentName, String assignedCohort){
//        name = studentName;
//        cohort = assignedCohort;
//    }

    //* ! * slide 9  this.slide * ! *
//    public String name;
//    public String cohort;
//
//    public Student(String name, String cohort){
//        this.name = name;
//        this.cohort = cohort;
//    }
//
//    public Student(String name){
//        this(name, "Unassigned");
//    }
//
//    public String rollCall() {
//        return this.name + " is here and ready for class!";
//    }

    //* ! * slide 10 private slide * ! *
    public String name;
    public String cohort;
    private double grade;

    public Student(String name, String cohort, double grade){
        this.name = name;
        this.cohort = cohort;
        this.grade = grade;
    }
    public Student(String name, double grade){
        this.name = name;
        this.cohort = "Unassigned";
        this.grade = grade;
    }

    public Student(String name){
        this.name = name;
        this.cohort = "Unassigned";
        this.grade = 0;
    }

    public double shareGrade(){
        return grade;
    }

    public String rollCall() {
        return this.name + " is here and ready for class!";
    }


    public static void main(String[] args) {
        //Name + Cohort available and passed as arugments
        Student nathan = new Student("Nathan Adcock", "Marco", 100);
        System.out.println(nathan.name + " - " + nathan.cohort);
        System.out.println(nathan.rollCall());

        //Name available and passed as the only argument
        Student nateDogg = new Student ("Nate Dogg");
        System.out.println(nateDogg.name + " - " + nateDogg.cohort);
    }

}
