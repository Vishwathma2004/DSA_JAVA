package OOPS;

public class Contructor {
    public static void main(String[] args) {
        Student xyz = new Student();
        System.out.println(xyz.name);
        System.out.println(xyz.rno);
        System.out.println(xyz.marks);
    }
}
class Student{
    int rno;
    String name;
    float marks;
    //we need a way to add the values of the above
    //properties object by object
    //we need one object to access every object
    Student(){
        this.name = "apple";
        this.rno = 100;
        this.marks = 99.1f;
    }
}