package packages.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        float a=5.0F;
        float b=0.0F;
        try {
            divide(a,b);
        }
       catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
         catch (Exception e) {
            System.out.println("Normal Exception");
        }
        finally {
            System.out.println("Final Statement");
        }
    }

    static void divide(float a,float b){
        System.out.print(a/b);
    }

}
