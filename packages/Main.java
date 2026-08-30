import java.util.*;
public class Main {

    public static void main(String[]args){
        // Box box=new Box();
        // System.out.println(box.l);
        // System.out.println(box.h);
        // System.out.println(box.w);

    Scanner sc=new Scanner(System.in);
    //   Boxprice box1=new Boxprice();
    //   System.out.print(box1.l+" "+box1.w+" "+box1.h+" "+box1.weight+" "+box1.cost);

      Boxprice box2=new Boxprice(5,5,70,50,500);
    System.out.print(box2.l+" "+box2.w+" "+box2.h+" "+box2.weight+" "+box2.cost);
    sc.close();
    }
}
