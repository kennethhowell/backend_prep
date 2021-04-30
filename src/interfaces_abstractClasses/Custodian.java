package interfaces_abstractClasses;

public class Custodian extends Employee implements DailyWork {

    public Custodian(String name, String department) {
        super(name, department);
    }

    //Our custodian class must define and flesh out its own work() method as set up in the Employee class
    public String work() {
        return "Maintaining the building!";
    }

    public String morningMeeting() {
        return "Custodians have a direct report to the head of the maintenance department. They schedule meets as necessary.";
    }

    public String lunchTime() {
        return "12:00 - 1:00PM";
    }

    public int dailyPay() {
        return 120;
    }

}
