package properties.Access;

public class A {
    private int num;
    protected String name;
    int []arr;
    
    public int getNum(){       // Getter function to get private varoable
        return num;
    }

    public void setNUm(int num){    //Setter Function for setting the variable
        this.num=num;
    }
    public A(int num,String name){
        this.num=num;
        this.name=name;
        this.arr=new int[num];
    }
    
}
