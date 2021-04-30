package interfaces_abstractClasses;

public class Accountant extends Employee implements DailyWork{

    public Accountant(String name, String department) {
        super(name, department);
    }

    //Our accountant class must define and flesh out its own work() method as set up in the Employee class
    public String work() {
        return "TPS Reports drafted";
    }


    public String morningMeeting() {
        return "Accountant morning meetings begin at 8:15AM and run until 8:45AM";
    }

    public String lunchTime() {
        return "Take my lunch when I want and at my desk";
    }

    public int dailyPay() {
        return 500;
    }

}
