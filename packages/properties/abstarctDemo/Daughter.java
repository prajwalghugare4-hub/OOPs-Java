package packages.properties.abstarctDemo;

public class Daughter extends Parent
{
    public boolean name;
    int age;
    @Override
    void career(String name) {
        System.out.println(" I want to be a "+name);
    }

    @Override
    void parent(String name, int age) {
       System.out.println(" I love "+ name + "his age is "+ age);
    }
}
