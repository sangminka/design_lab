package ex05;

import ex05.teacher.JavaTeacher;
import ex05.teacher.Teacher;

public class App {

    public static void main(String[] args) {
        Teacher tt = new JavaTeacher();
        JavaTeacher tt2 = new JavaTeacher();
        tt.수업하기();
        tt2.수업하기();
    }
}
