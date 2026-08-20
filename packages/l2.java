 // Static is keyword which belongs to class funstion and which is indpendent on objects
 // Non Static is dependent on objects and can access inside the object funtion only
class B 
{  
     
    public static void main(String[] args) {
        // To Access the non static in static either non static should get a class or make it static 
        // Here B is class obj is new object
        B obj = new B();
        obj.greeting();
        Student s4=new Student();
        System.out.println(s4.name);
    }

    void greeting(){
        System.out.println("Hello World!");
    }
}