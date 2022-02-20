package model.expand;
/**
 * @Title学生奖状案例这是奖状类
 * @Time 2022年2月20日 17:11:43
 * @Author：yjh
 */
public class Citation implements Cloneable {
//为了深克隆注释了getset方法和成员变量
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    //    三好学生的姓名
//    private String name;
//
//    public Citation() {
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
//    测试深克隆注释了show方法
//    public void show(){
//        System.out.println(name+"同学：在2020学年第一学期中表现优秀被评委三好学生。特发此状");
//    }
    public void showshengdukelong(){
        System.out.println(student.getName()+"同学：在2020学年第一学期中表现优秀被评委三好学生。特发此状");
    }
}
