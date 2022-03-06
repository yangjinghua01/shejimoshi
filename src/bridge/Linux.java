package bridge;
/**
 * @Title Linux操作系统（扩展抽象化角色）
 * @Time 2022年2月21日 11:44:34
 * @Author：yjh
 */
public class Linux extends OpratingSystem{
    public Linux(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
