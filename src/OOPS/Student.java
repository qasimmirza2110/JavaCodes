package OOPS;

public class Student {
    String Stdname;
    String stream;
    String course;
    String gender;
    int age;

    public void details() {
        System.out.println("Name: " + Stdname);
        System.out.println("Stream: " + stream);
        System.out.println("Course: " + course);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Student qasim = new Student();
        qasim.Stdname = "Mirxa Qasim";
        qasim.stream = "Computer Science";
        qasim.course = "BCA";
        qasim.gender = "Male";
        qasim.age = 17;

        Student muqtada = new Student();
        muqtada.Stdname = "Muqtada Rixvi";
        muqtada.stream = "Computer Science";
        muqtada.course = "BCA";
        muqtada.gender = "Non binary";
        muqtada.age = 19;

        Student agnel = new Student();
        agnel.Stdname = "Agnel";
        agnel.stream = "Computer Science";
        agnel.course = "JIB";
        agnel.gender = "Male";
        agnel.age = 20;

        // Print details
        qasim.details();
        muqtada.details();
        agnel.details();
    }
}
