package packages.ComaprisonDemo;

public class Student implements Comparable<Student> {
    String name;
    float Marks;
    int rn;

    public Student(String name,float Marks,int rn){
        this.name=name;
        this.Marks=Marks;
        this.rn=rn;
    }

    @Override
    public String toString() {
        return name+" "+rn;
    }

    @Override
    public int compareTo(Student o) {
        int diff= (int) ((int)this.rn - o.rn);

        //if diff==0 then both are equal
        // diff<0 then 2nd Student  has more marks
        return diff;
    }


}
