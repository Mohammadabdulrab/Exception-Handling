package exceptionexample;

public class NestedTryBlock {
    public static void main(String[] args) {
        try{
            System.out.println("Inside the 1st try block");
            int a=10;
            int res=a/0;
            System.out.println("res is :"+res);
        }catch(ArithmeticException e1){
            System.out.println("Excetion Occured in 1st try block :"+e1.getMessage());
        }
        System.out.println("Outside the try block.");
    }
}
