 // Static is keyword which belongs to class function and which is indpendent on objects
 // Non Static is dependent on objects and can access inside the object funtion only
 import java.util.*;
 

class B 
{  
     
    public static void main(String[] args) {
        // To Access the non static in static either non static should get a class or make it static 
        // Here B is class obj is new object
        Employee Yash =new Employee();
        System.out.println(Yash.name);
        System.out.println(Yash.salary);
        System.out.println(Yash.country);
        
        // System - class
        // out - variable
        // print - method
    }

    static void greeting(){
        System.out.println("Hello World!");
    }
}

class Employee {

    final String country="India";
    String name;
    int salary;
    Employee(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Name:");
        name=sc.next();
        System.out.print("Salary:");
        salary=sc.nextInt();
        sc.close();
    }
}
