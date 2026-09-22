package Collections;

import java.util.LinkedList;
import java.util.List;

public class A {
    public static void main(String[] args) {
        List<Integer> ls=new LinkedList<>();
        for(int i=0;i<10;i++) {
            ls.add(i+1);
        }
        System.out.print(ls);
    }
}
