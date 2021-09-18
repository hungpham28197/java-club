import model.Student;

public class Demo {

    private static int counter;

    static {
        System.out.println("Khoi static trong main: " + counter);
        counter = 10;
    }

    public static void main(String[] args) {
        System.out.println("Chay ham main");

        Student student1 = new Student(); // object student1
        student1.setName("Cong");
        //student1.setAge(22);

        System.out.println("Student 1 " + student1.getName());

        System.out.println(Student.school);

        //student1.learnPublic();
//        student1.learn("a");
//        student1.learn(1);
//        student1.learn();

//        System.out.println(student1.getName());
//        System.out.println(student1.getAge());

        System.out.println(student1.getThis());

        Student student2 = new Student("Dung"); // object student1

        System.out.println(student2.getThis());


        System.out.println(Student.counter);

        Student.learnStatic();

//        Student student3 = student1; // Khong nen dung
//
//        System.out.println(student3.getThis());
//
//        student3.setName("Hung");
//
//        System.out.println("Thang 1 " + student1.getName());
    }
}
