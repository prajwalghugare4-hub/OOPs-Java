package packages.properties.Access;

public class Objectdemo {
    int value;
    public Objectdemo(int value){
        this.value=value;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }



    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args){
        Object obj=new Objectdemo(4);
        System.out.print(obj.hashCode());
    }

}
