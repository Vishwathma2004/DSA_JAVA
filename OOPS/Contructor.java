public class Contructor {
    public static void main(String[] args) {
        Student abcd = new Student(100,"Alice",90.1f);
        System.out.println();
        abcd.greeting();
        abcd.changeName("Bob");
        System.out.println();
        abcd.greeting();
        
    }
}
class Student{
    int rno;
    String name;
    float marks;

    void greeting(){
        System.out.println("Hello My name is "+name);
    }
    Student(){
        this.rno = 45;
        this.name = "abc";
        this.marks = 88.8f;
    }
    void changeName(String newName){
        name = newName;
    }
    Student(int rollno,String namee,float markss){
        rno = rollno;
        name = namee;
        marks = markss;
    }
}