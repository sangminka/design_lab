package ex08;

import ex08.student.HistoryStudent;
import ex08.student.MathStudent;
import ex08.student.ScienceStudent;
import ex08.student.Student;

import java.util.ArrayList;
import java.util.List;

public class HomewrokDelegator {


    // 반 학생들 컬렉션에 담기
    List<Student> students = new ArrayList<>();

    public HomewrokDelegator() {
        students.add(new MathStudent());
        students.add(new MathStudent());
        students.add(new ScienceStudent());
        students.add(new HistoryStudent());
        students.add(new HistoryStudent());
        students.add(new HistoryStudent());
    }

    public void delegateHomework(String keyboard){
        students.stream()
                .filter(student -> student.isSameHomework(keyboard))
                .forEach(student -> student.doHomework());
    }
}
