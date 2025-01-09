package exceptionexample;

public class MainClass {
    public static void main(String[] args) {
        try{
            System.out.println("Inside the try block");
            int a=10;
            if(a==10){
                throw new MyOwnException("some customised exception");
            }
        }catch(Exception e){
            System.out.println("Exception Occured: "+e.getMessage());
        }
    }
}
