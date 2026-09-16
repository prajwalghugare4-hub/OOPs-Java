package packages.properties.generics;

import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static final int DEFAULT_SIZE=10;
    private int size=0;

    public CustomArrayList() {
        this.data=new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }


    private void resize() {
        int []temp=new int[data.length*2];
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

    public int remove(){
        return data[--size];
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index,int value){
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
        CustomArrayList lis=new CustomArrayList();
//        lis.add(3);
//        lis.add(4);
//        lis.add(8);

        for(int i=0;i<14;i++){
            lis.add(2*i);
        }

        System.out.println(lis);

    }
}
