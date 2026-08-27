// 1. Inheritance: A Child Class is Inherting properties from base class.
// Child class will have the extend propeties also the inherting properties of base class but base class
// will not have extend properties of child class


import java.util.*;
public class Box 
{
    Scanner sc= new Scanner(System.in);
    double l;
    double w;
    double h;

    Box(){
        System.out.print("Length of Box:");
        this.l=sc.nextDouble();
        System.out.print("height of Box:");
        this.h=sc.nextDouble();
        System.out.print("width of Box:");
        this.w=sc.nextDouble();
    }

    //Cube 
    Box(double side){
        this.w=side;
        this.l=side;
        this.h=side;
    }

    public Box(double l, double h, double w){
        this.l=l;
        this.w=w;
        this.h=h;
    }

    Box(Box old){
      this.l=old.l;
      this.w=old.w;
      this.h=old.h;
    }

    public void info(){
        System.out.println("Running the box");
    }
}

class M
{
   Box red=new Box(4 ,5,3);
    {
        System.out.println(red.l);
    }
}
