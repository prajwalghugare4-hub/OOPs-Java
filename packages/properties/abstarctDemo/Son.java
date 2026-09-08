package packages.properties.abstarctDemo;

public class Son extends Parent{
 int age;
    @Override
    void career(String name) {
         System.out.println("I am going to be a " + name);
    }

    @Override
    void parent(String name, int age) {
        System.out.println("I Love "+ name+ " she is "+ age +"old.");
    }
}
