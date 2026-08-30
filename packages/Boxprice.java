import java.util.*;
public class Boxprice extends BoxWeight {
    double cost;

    Boxprice(){
        Scanner sc= new Scanner(System.in);
        cost=sc.nextDouble();
        sc.close();
    }

    Boxprice(Boxprice other){
        this.cost=other.cost;        // Constructor Overloading
    }

     public Boxprice(double l, double h, double w, double weight, double cost){
        super(l,h,w,weight);
         this.cost = cost;
     }
 }

