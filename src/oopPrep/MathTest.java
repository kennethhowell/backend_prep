package oopPrep;

public class MathTest {
    //Here are are in a different class: we can access these methods without instantiating an objecting, and, in some way, this might remind you of something we've interacted with before (Math.random())
    public static void main(String[] args) {
        System.out.println("Arithmetic.pi = " + Arithmetic.pi);
        System.out.println("Arithmetic.add(10, 5) = " + Arithmetic.add(10, 5));
        System.out.println("Arithmetic.multiply(10,7) = " + Arithmetic.multiply(10, 7));
    }
}
