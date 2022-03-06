package bridge;
/**
 * @Title 抽象的操作系统类 （抽象化角色）
 * @Time 2022年2月21日 11:44:34
 * @Author：yjh
 */
public abstract class OpratingSystem {
//    声明 videoFile变量
    protected  VideoFile videoFile;

    public OpratingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }
    public  abstract  void play(String fileName);
}
