class A
{
    public static void main(String[] args) {
        // Accessing the class's constructor
        Student random = new Student(13, "Prajwal"); // FIXED: use quotes + matching constructor
        System.out.println(random.rn + " " + random.name);

        // Example: using the copy constructor (object inside object)
        Student s2 = new Student(random);
        System.out.println(s2.rn + " " + s2.name);


        //Refrence objects pointing to same memory address
        //If one.name gets change then two.name also gets change
        Student one =new Student();
        Student two =one;

        one.name="Something something";
        System.out.println(two.name);


    }
}

class Student{
    int rn;
    String name;
    // constructor : It is a special fuction that creates an object
    // this - Keyword for accessing the current object's own fields inside the class

    // constructor overloading: When we call object with the parameters the constructor 2 will be printed
    // When we call constructor with zero parameters then it will call constructor 1

    Student(Student other){           //To prevent constructor overloading 
        this.name=other.name;
        this.rn=other.rn;
    }
    // constructor 1 
     // single constructor for single object without parameters
      Student(){
        this.rn=13;
        this.name="Prajwal";
      }

      // constructor 2
     // Templete for the multiple objects  with parameters 
      Student(int rn,String name){
        this.name=name;
        this.rn=rn;
      }
}