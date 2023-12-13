public class Student {
    private  int rollno;
    private String name;
    private static  String college = "BBDIT";

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public Student() {
    }

    static  void change() {
        college = "CODEGYM";
    }
    void display() {
        System.out.println(this.rollno + " " + this.name + " " + college);
    }
}

