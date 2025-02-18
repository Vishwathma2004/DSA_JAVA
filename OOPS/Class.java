import java.util.*;

public class Class {
    public static void main(String[] args) {
        //Allocates memory at RunTime(dynamically allocate memory)
        Student[] student = new Student[5];
        System.out.println(Arrays.toString(student));
    }
}

class Student{
    int rno;
    String name;
    float marks;
}