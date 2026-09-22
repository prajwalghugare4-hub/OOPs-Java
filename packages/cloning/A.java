package packages.cloning;

import java.util.LinkedList;
import java.util.Stack;

public class A {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human prajwal=new Human(19,"Prajwal");
        Human yash=prajwal;

        yash = (Human) prajwal.clone();

        System.out.println(yash.age);
    }
}
