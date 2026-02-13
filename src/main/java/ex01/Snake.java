package ex01;


// 새로운걸 생성해도 기존 코드는 건들이지 않아도 된다.
public class Snake extends Animal{
    private String name = "뱀";

    @Override
    public String getName() {
        return name;
    }
}
