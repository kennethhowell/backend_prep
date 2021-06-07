package interfaces_abstractClasses;

import java.util.ArrayList;

public class Company { //haberdasheryINC
    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();

            Employee numberBot = new Accountant("numberBot", "Accounting"); // [✓] We can instantiate an accountant just fine [✓]
            Employee cleanerBot = new Custodian("cleanerBot", "Maintenance"); // [✓] We can instantiate a custodian just fine [✓]
//            Employee workerTron = new Employee(); // [X] We cannot instantiate the Employee class! Abstract classes cannot be directly instantiated! [X]

//        System.out.println("DailyWork.businessHours = " + DailyWork.businessHours);
        System.out.println("Employee name and department = " + numberBot.getName() + " : " + numberBot.getDepartment());
        System.out.println("Employee morning meeting expectations = " + numberBot.morningMeeting());
        System.out.println("Employee lunchtime expectations = " + numberBot.lunchTime());
        System.out.println("Employee daily pay grade = " + numberBot.dailyPay());

        System.out.println("Employee name and department = " + cleanerBot.getName() + " : " + cleanerBot.getDepartment());
        System.out.println("Employee morning meeting expectations = " + cleanerBot.morningMeeting());
        System.out.println("Employee lunchtime expectations = " + cleanerBot.lunchTime());
        System.out.println("Employee daily pay grade = " + cleanerBot.dailyPay());


        System.out.println("numbersBot.work() = " + numberBot.work());
        System.out.println("cleanerBot.work() = " + cleanerBot.work());


    }
}
