package pattern.SingletonRuntimeDemo;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Title对Runtime类的使用测试---->单例模式
 * @Time 2022年2月17日 12:21:10
 * @Author：yjh
 */
public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
//        1.获取Runtime类的对象
        Runtime runtime = Runtime.getRuntime();
//        2.调用Runtime的方法exec
        Process exec = runtime.exec("ipconfig");
//        3.调用exec对象的获取输入流的方法
        InputStream inputStream = exec.getInputStream();
        byte [] arr = new byte[1024*1024*100];
//       读取数据
        int len = inputStream.read(arr); //返回读到的字节的个数
//        将字节数组转化为字符串输出打印
        System.out.println(new String(arr,0,len,"GBK"));
        Runtime runtime1 = Runtime.getRuntime();
        System.out.println(runtime == runtime1);

    }
}
