package LawOfDemeter;
/**
 * @Title设计原则迪米特原则案例
 * @Descriotion 粉丝类
 *  @Time2022年2月15日 22:16:24
 *  @Author：yjh
 */
public class Fans {
    private String name;

    public Fans(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
