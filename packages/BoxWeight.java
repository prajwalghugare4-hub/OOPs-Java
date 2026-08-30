import java.util.*;
public class BoxWeight extends Box {
     double weight;
     Scanner sc = new Scanner(System.in);
     public BoxWeight(){
        System.out.print("Weight of Box:");
        weight=sc.nextDouble();
        sc.close();

     }
     
     public BoxWeight(double l,double h,double w,double weight){
        super(l,h,w); // what is this? Calls the parent class Constructor
        // used intialize values presnt in parent class
        this.weight = weight;
     }

    
}
