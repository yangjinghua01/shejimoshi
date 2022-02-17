package pattern.Singleton6;

/**
 * JDK 源码分析
 * 复现Runtime这个类
 */
public class Runtime {
    private Runtime() {
    }
    private static final Runtime currentRuntime = new Runtime();
    public static Runtime getRuntime() {
        return currentRuntime;
    }
}
