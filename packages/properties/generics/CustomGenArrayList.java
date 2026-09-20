package packages.properties.generics;

import java.util.ArrayList;
import java.util.Arrays;


public class CustomGenArrayList <T>{

    private Object[]data;
    private static final int DEFAULT_SIZE=10;
    private int size=0;

    public CustomGenArrayList() {
        this.data=new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }


    private void resize() {
       Object[]temp=new Object[data.length*2];
        // copy elements current to temp
        for(int i=0;i< data.length;i++) {
            temp[i]=data[i];
        }
        data=temp;
    }

    public boolean isFull(){
        if(size == data.length){
            return true;
        }
        else{
            return false;
        }

    }

    public T remove(){
       T removed=(T) (data[--size]);
       return removed;
    }

    public T  get(int index){

        return (T) data[index];
    }

    public int size(){

        return size;
    }

    public void set(int index,T value){
        data[index]=value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomGenArrayList<Character> lis = new CustomGenArrayList<>();
//        lis.add(3);
//        lis.add(4);
//        lis.add(8);
        for (char i = 'A'; i <= 'Z'; i++) {
            if(i=='B')continue;
            lis.add(i);
        }

        System.out.println(lis);
    }
}
