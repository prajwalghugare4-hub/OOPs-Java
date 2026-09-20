package packages.LamadaFunctions;



//import java.util.ArrayList;
//import java.util.function.Consumer;

public class LamadaFunctions {
    public static void main(String[] args) {
//        ArrayList<Integer>nums=new ArrayList<>();
//
//        for(int i=0;i<5;i++){
//            nums.add(i+1);
//        }
        //nums.forEach((item)->System.out.println(2*item));
        // Item represents each element in an ArrayList
//
//        Consumer<Integer>fun=(item)->System.out.println((item*2));
//        nums.forEach(fun);

        Operation sum=(int a,int b)->a+b;
        Operation diff=(int a,int b)->a-b;
        Operation prod=(int a,int b)->a*b;

        LamadaFunctions myCal= new LamadaFunctions();
        System.out.println( myCal.operate(5,3,sum));
        System.out.println( myCal.operate(5,3,diff));
        System.out.println( myCal.operate(5,3,prod));

    }
   private int operate(int a,int b,Operation op){
        return op.operation(a,b);
   }

    public interface Operation {
        int operation(int a,int b);
    }

}
