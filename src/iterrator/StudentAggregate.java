package iterrator;
/**
 * @Title 抽象聚合角色类
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */
public interface StudentAggregate {
//    添加学生功能
    void addStudent(Student student);
//    删除学生功能
    void removeStudent(Student student);
//    获取迭代其对象功能
    StudentInterrator getStudentintertor();
}
