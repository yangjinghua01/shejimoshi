package pattern.Singleton6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @Title设计模式
 * @Descriotion 单例模式  ---->序列化破坏
 * @Time2022年2月16日 17:01:03
 * @Author：yjh
 */
public class CLient {
    public static void main(String[] args) throws Exception {
//        writhObject2File();
        readObjectfromFile();
        readObjectfromFile();
    }

    //    从文件中读取数据（对象）
    public static void readObjectfromFile() throws Exception {
        //        创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\16920\\Desktop\\yjh.txt"));
    //    读取对象
        singleon singleon = (pattern.Singleton6.singleon) ois.readObject();
        System.out.println(singleon);
        ois.close();
    }

    //    向文件中写数据（对象）
    public static void writhObject2File() throws Exception {
        //获取singleon对象
        singleon singleon = pattern.Singleton6.singleon.getInstance();
        //       创建输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\16920\\Desktop\\yjh.txt"));
        //    写对象
        oos.writeObject(singleon);
        //        释放资源
        oos.close();

    }
}
