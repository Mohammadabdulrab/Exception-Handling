package exceptionexample;

public class ThrowsExceptionExample {

    public void demo() throws IllegalAccessException, InterruptedException{
        System.out.println("Inside the demo method");
        int a=10;
        if(a==10){
            throw new RuntimeException("a value is 10 and unchecked Excepton");
        }

        if(a==20){
            throw new ArithmeticException("a value is 20 and unchecked Excepton");
        }

        if(a==30){
            throw new IllegalAccessException("a value is 30 and checked Excepton");
        }

        if(a==40){
            throw new InterruptedException("a value is 40 and checked Excepton");
        }
    }
    public static void main(String[] args) {
        try{
            System.out.println("Inside the try block:");
            ThrowsExceptionExample throwsExceptionExample = new ThrowsExceptionExample();
            throwsExceptionExample.demo();

        }catch(Exception e){
            System.out.println("Exception Occured:"+e.getMessage());
        }

    }
}
