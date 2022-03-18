package iterrator;

import java.util.ArrayList;
import java.util.List;

public class StudentggregaeImpl implements StudentAggregate{
    List<Student>list = new ArrayList<>();
    @Override
    public void addStudent(Student student) {
        list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        list.remove(student);
    }

    @Override
    public StudentInterrator getStudentintertor() {
        return new StudentInterIMPl(list) ;
    }
}
