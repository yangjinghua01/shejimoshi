package bridge;
/**
 * @Title RmvcFile视频文件（具体的实现化角色）
 * @Time 2022年2月21日 11:44:34
 * @Author：yjh
 */
public class RmvbFile implements VideoFile{
    @Override
    public void decode(String filenam) {
        System.out.println("RmvcFile视频文件" + filenam);
    }
}
