package observe;

public class Client {
    public static void main(String[] args) {
//        创建公众号对象
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();
//        订阅公众号
        subscriptionSubject.attache(new WeiXinUser("11"));
        subscriptionSubject.attache(new WeiXinUser("22"));
        subscriptionSubject.attache(new WeiXinUser("33"));
//        公众号更新
        subscriptionSubject.notify("yjh");
    }
}
