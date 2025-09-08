package oo.step3;

import oo.Klass;
import oo.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StudentTest {

    @Test
    public void should_return_false_when_student_not_join_klass_and_is_not_in_klass(){
        Student student = new Student(1, "Tom", 18);
        Klass klass = new Klass(1);

        assertFalse(student.isIn(klass));
    }

    @Test
    public void should_return_true_when_student_not_join_klass_and_is_in_klass(){
        Student student = new Student(1, "Tom", 18);
        Klass klass = new Klass(1);

        student.join(klass);

        assertFalse(student.isIn(klass));
    }

    @Test
    public void should_return_recently_klass_when_student_join_two_klass(){
        Student student = new Student(1, "Tom", 18);
        Klass klass = new Klass(1);
        Klass klass2 = new Klass(2);

        student.join(klass);
        student.join(klass2);

        assertFalse(student.isIn(klass));
        assertTrue(student.isIn(klass2));
    }

    // when introduce a student is in a class then return message with name age and class

}
