package exceptionexample;

public class NestedTryBlock {
    public static void main(String[] args) {
        try{
            System.out.println("Inside the 1st try block");
            int a=10;
            int res=a/0;
            System.out.println("res is :"+res);
            try{
                System.out.println("Inside the 2nd try block.");
                String msg1="Hi Mohammad Abdul Rab";
                System.out.println("msg1 length is :"+msg1.length());
                String msg2=null;
                System.out.println("msg2 length is:"+msg2.length());
                try{
                    System.out.println("Inside the 3rd try block:");
                    int arr[]={10,86,97};
                    System.out.println("Array's value at 5th index is:"+arr[5]);
                }catch(ArrayIndexOutOfBoundsException e3){
                    System.out.println("Exception Occured in 3rd Try block is : "+e3.getMessage());
                }
            }catch(NullPointerException e2){
                System.out.println("Exception Occure in 2nd try block is :"+e2.getMessage());
            }
        }catch(ArithmeticException e1){
            System.out.println("Excetion Occured in 1st try block :"+e1.getMessage());
        }
        System.out.println("Outside the try block.");
    }
}
