package exceptionexample;

public class FinallyExample {
    public static void main(String[] args) {
        try{
            int a=10;
            System.out.println(" a is :"+a);
            int res=a/0;
            System.out.println("res is "+res);
        }catch(Exception e){
            System.out.println("Exception Occured: "+e.getMessage());
        }
        finally{
            System.out.println("Final block executing every time when any Exception occured or not");
            System.out.println("If we are writing try block then there is compulsory to write catch block or finally block " +
                    "or both in same time but any one is mandatory otherwise it will give error");
        }
    }
}
