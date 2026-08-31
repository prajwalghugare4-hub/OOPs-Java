package properties.Polymorphism;

public class Circle extends Shapes{

    //this will run when obj of Circle is created
    // hence it is overriding the parent method
    @Override // this is called anotation- For checking wheather its overriding or not
    void area(){
    System.out.println("Area is Pie r^2");
    }
}
