package exceptionexample;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try{
            System.out.println("inside the try block before exception");
            int a=10;
            int res=a/0;
            System.out.println("Inside the try block after the exception occured ");

        }catch(ArithmeticException e){
            System.out.println("Exception Occured :"+e.getMessage());
        }
        System.out.println("Outside the try and catch block.");
    }
}
