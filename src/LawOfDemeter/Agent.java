package LawOfDemeter;
/**
 * @Title设计原则迪米特原则案例
 * @Descriotion 经济人类
 *  @Time2022年2月15日 22:16:24
 *  @Author：yjh
 */
public class Agent {
    private Start start;
    private Company company;
    private Fans fans;

    public void setStart(Start start) {
        this.start = start;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }
//    和fans见面的方法
    public void meeting(){
        System.out.println("和粉丝见面===========》"+start.getName()+"和fans"+fans.getName());
    }
//和媒体公司洽谈的方法
    public void business(){
        System.out.println(start.getName()+"和"+company.getName()+"洽谈");
    }
}
