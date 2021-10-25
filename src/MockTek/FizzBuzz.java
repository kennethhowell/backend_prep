package MockTek;

public class FizzBuzz {
    //input divisible by 3, print fizz
    //input divisible by 5, print buzz
    //input divisible by 3 && 5, print fizzbuzz
    //otherwise print number

    //how would I accomplish the above?
    public static void main(String[] args) {
        int num = 2;

        if(num % 3 == 0 && num % 5 == 0){
            System.out.println("Fizzbuzz");
        } else if (num % 5 == 0){
            System.out.println("Buzz");
        } else if (num % 3 == 0){
            System.out.println("Fizz");
        } else {
            System.out.println("The number is: " + num);
        }
    }




}

