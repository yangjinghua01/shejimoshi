package model1;

import java.io.*;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
//        创建原型对象
        Citation citation = new Citation();
//        创建张三学生对象
        Student stu = new Student();
        stu.setName("张三");
        citation.setStudent(stu);
//创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\16920\\Desktop\\yjh.txt"));
//        写对象
        oos.writeObject(citation);
//        释放资源
        oos.close();
//        创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\16920\\Desktop\\yjh.txt"));
//        读取对象
         Citation citation1 = (Citation) ois.readObject();
//        释放资源
        ois.close();
        Student student1 = citation1.getStudent();
        student1.setName("李四");
        citation.showshengdukelong();
        citation1.showshengdukelong();
    }
}
