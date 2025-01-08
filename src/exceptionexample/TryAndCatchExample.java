package exceptionexample;

public class TryAndCatchExample {
    public static void main(String [] args) {
        try {
            System.out.println("Inside the try block.");
            int a = 10;
            System.out.println("a is :" + a);
            int res = 20;
            System.out.println("res is :" + res);
            res = a / 0;
            System.out.println("After changes res is :" + res);
        } catch (ArithmeticException e) {
            System.out.println("Execption Occured:" + e.getMessage());
        }
        System.out.println("Outside try and catch block.");
    }
}
