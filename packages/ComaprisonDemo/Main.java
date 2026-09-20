package packages.ComaprisonDemo;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student Raj=new Student("Raj",88.9F,13);
        Student Isha=new Student("Isha",78.2F,12);
        Student Arjun=new Student("Arjun",98.2F,11);
        Student Kavya=new Student("Kavya",71.2F,10);
        Student Aarav=new Student("Isha",88.2F,9);

//        if(Raj.compareTo(Isha)<0){
//            System.out.println("Isha has more Marks than Raj");
//        }
//        else{
//            System.out.println(Raj.compareTo(Isha));
//            System.out.println("Raj has more Marks than Isha");
//
//        }

        Student []students= {Raj,Isha,Arjun,Kavya,Aarav};

        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));



    }
}
