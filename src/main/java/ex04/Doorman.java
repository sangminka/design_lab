package ex04;

public class Doorman {
    public static Doorman instance = new Doorman();

    private Doorman(){}

    // 책임
    public void 쫓아내(Animal animal){
        System.out.println(animal.getName() + "쫓아내");
        
    }

    // 책임(SRP) 기존 코드를 수정하지않고 proxy를 통해 코드를 변환 한것 처럼 볼 수 있음
}
