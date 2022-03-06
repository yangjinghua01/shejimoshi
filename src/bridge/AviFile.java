package bridge;
/**
 * @Title  avi视频文件（具体的实现化角色）
 * @Time 2022年2月21日 11:44:34
 * @Author：yjh
 */
public class AviFile  implements VideoFile{
    @Override
    public void decode(String filenam) {
        System.out.println("avi 视频文件"+filenam);
    }
}
