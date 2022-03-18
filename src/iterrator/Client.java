package iterrator;

public class Client {
    public static void main(String[] args) {
        StudentggregaeImpl studentggregae = new StudentggregaeImpl();
        studentggregae.addStudent(new Student("z","4"));
        studentggregae.addStudent(new Student("l","1"));
        studentggregae.addStudent(new Student("w","2"));
        studentggregae.addStudent(new Student("w","6"));
//        遍历迭代器对象
        StudentInterrator interrator = studentggregae.getStudentintertor();
        while (interrator.hasNext()){
            Student student = interrator.next();
            System.out.println(student.toString());
        }

    }
}
