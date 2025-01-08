package exceptionexample;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try{
            System.out.println("Inside the try block before exception occuring.");
            int a=10;
            int res=a/0;
            String msg1=null;
            int arr[]={10,20,30};
            System.out.println("Array value at 6th index:"+arr[6]);
        }catch(ArithmeticException e1){
            System.out.println("Exception Occured :"+e1.getMessage());
        }catch(ArrayIndexOutOfBoundsException e2){
            System.out.println("Exception Occured:"+e2.getMessage());
        }catch(NullPointerException e3){
            System.out.println("Exception Occured :"+e3.getMessage());
        }

        System.out.println("After multiple catch blocks.");
    }
}
