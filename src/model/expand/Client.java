package model.expand;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
//        创建原型对象
        Citation citation = new Citation();
//        创建张三学生对象
        Student stu = new Student();
        stu.setName("张三");
        citation.setStudent(stu);
//        克隆奖状对象
        Citation citation1 = citation.clone();
        citation1.getStudent().setName("李四");
//        citation.setName("张三");
//        citation1.setName("李四");
//        调用show方法
//        citation.show();
//        citation1.show();
        citation.showshengdukelong();
        citation1.showshengdukelong();
    }
}
