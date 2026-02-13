package ex06;

import ex06.notification.BasicNotifier;
import ex06.notification.EmailNotifier;
import ex06.notification.Notifier;
import ex06.notification.SmsNotifier;

/**
 *     {
 *      "sends" : [basic, email],
 *       "msg": "반가워!!"
 *     }
 */
// 정의 : 기존에 있는 클래스(속옷)에 기능을 확장하면서 계속 추가하는 패턴
public class App {

    public static void main(String[] args) {
        // 1번 문제(SMS 알림 SMS 알림 Email 알림)
        Notifier n1 = new EmailNotifier(new SmsNotifier(new SmsNotifier()));
//        n1.send();
        // 2번 문제(기본 알림 SMS 알림 Email 알림)
        Notifier n2 = new EmailNotifier(new SmsNotifier(new BasicNotifier()));
//        n2.send();
        // 3번 (SMS)
        Notifier n3 = new SmsNotifier();
        n3.send();
    }
}
