package iterrator;

import java.util.ArrayList;
import java.util.List;

public class StudentInterIMPl implements StudentInterrator{
    private List<Student> list;
    private int position;//用来记录遍历时的位置

    public StudentInterIMPl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position<list.size();
    }

    @Override
    public Student next() {
        Student student = list.get(position);
        position ++;
        return student;
    }
}
