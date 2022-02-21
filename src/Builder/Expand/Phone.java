package Builder.Expand;


/**
 * @Title手机类
 * @Time 2022年2月20日 17:11:43
 * @Author：yjh
 */
public class Phone {
    private String cpu;
    private String screen;
    private String memoeey;
    private String mainboard;

    private Phone(Builder buidler) {
        this.cpu = buidler.cpu;
        this.screen = buidler.screen;
        this.mainboard = buidler.mainboard;
        this.memoeey = buidler.memoeey;
    }

    public static final class Builder {
        private String cpu;
        private String screen;
        private String memoeey;
        private String mainboard;

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder screen(String screen) {
            this.screen = screen;
            return this;
        }

        public Builder memoeey(String memoeey) {
            this.memoeey = memoeey;
            return this;
        }

        public Builder mainboard(String mainboard) {
            this.mainboard = mainboard;
            return this;
        }
//        使用构建者创建块对象
        public Phone builder(){
            return  new Phone(this);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memoeey='" + memoeey + '\'' +
                ", mainboard='" + mainboard + '\'' +
                '}';
    }
}