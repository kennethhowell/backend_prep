package interfaces_abstractClasses;

abstract class Employee {
    protected String name;
    protected String department;

    public Employee(String name, String department){
        this.name = name;
        this.department = department;
    }

    public String getName(){
        return this.name;
    }

    public String getDepartment(){
        return this.department;
    }

//    public abstract String work();


}
