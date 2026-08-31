package properties.Polymorphism;

public class Numbers {
    double sum(int a,int b){
        return a+b;
    }

    double sum (int a,int b,int c){
        double d=a+b+c;
        return d;
    }
    public static void main(String[] args) {
        Numbers obj=new Numbers();
        System.out.println(obj.sum(3,4));
        System.out.println(obj.sum(3,4,10));
       // System.out.println(obj.sum(3,4,9,8)); //Overloading - Whe there are same methods name but with different
                                            // types,arguements andd return types


    }
    
}
