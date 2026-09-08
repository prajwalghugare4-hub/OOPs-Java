import java.util.*;
class T
{
    public static void main (String[] args){
      Location m1=new Location();
      m1.getinfo();
      m1.printLocation();

    }
}

class Location{
    Scanner sc= new Scanner(System.in);
    String country;
    String city;

    void getinfo(){
       System.out.print("Country:");
       country=sc.next();

    System.out.print("City:");
     city=sc.next();

     sc.close();
    }

    public void printLocation() {
        System.out.println("Country:" + country +"\nCity:"+city);
    }
}