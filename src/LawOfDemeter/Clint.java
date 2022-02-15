package LawOfDemeter;

public class Clint {
    public static void main(String[] args) {
//        创建经济人类
        Agent agent = new Agent();
//         创建明星
        Start start = new Start();
        start.setName("苍井空");
//        创建经济公司
        Company company = new Company("麻豆视频");
//        创建粉丝
        Fans fans = new Fans("91秦先生");
        agent.setStart(start);
        agent.setCompany(company);
        agent.setFans(fans);
        agent.business();
        agent.meeting();
    }
}
