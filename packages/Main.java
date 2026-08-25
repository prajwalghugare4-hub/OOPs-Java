public class Main {
    public static void main(String[]args){
        // Box box=new Box();
        // System.out.println(box.l);
        // System.out.println(box.h);
        // System.out.println(box.w);

        BoxWeight box3=new BoxWeight();
        BoxWeight box4=new BoxWeight(4,5,6,5);
        System.out.print(box3.l+" "+box3.h+" "+box3.w+" "+box3.weight);
        System.out.println("\n"+box4.l+" "+box4.h+" "+box4.w+" "+box4.weight);
    }
}
