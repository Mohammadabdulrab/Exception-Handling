package exceptionexample;



public class ThrowExample {

    public void Sample(){
        System.out.println("Inside the sample method before throwing exception");
        int a=10;
        if(a==10){
            throw new RuntimeException("Some random Exception Occured");
        }
        System.out.println("a is: "+a);
    }


    public static void main(String[] args) {
        try{
            ThrowExample throwExample= new ThrowExample();
            throwExample.Sample();
        }catch(Exception e){
            System.out.println("Exception Occured :"+e.getMessage());
        }

    }


}
