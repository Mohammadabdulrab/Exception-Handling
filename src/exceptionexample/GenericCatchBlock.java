package exceptionexample;

public class GenericCatchBlock {
    public static void main(String[] args) {
        try{
            System.out.println("Inside the try block before exception:");
            int a=10;
            int res=a/10;
            int arr[]={10,20,30,40};
            System.out.println("Array value at 7th index is :"+arr[7]);
        }catch(Exception e){
            System.out.println("Exception Occured :"+e.getMessage());
        }

        System.out.println("After Generic catch");
    }
}
