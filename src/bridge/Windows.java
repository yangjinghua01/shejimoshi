package bridge;
/**
 * @Title Windows 操作系统   扩展抽象化角色（windows操作系统）
 * @Time 2022年2月21日 11:44:34
 * @Author：yjh
 */
public class Windows  extends OpratingSystem{
    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
