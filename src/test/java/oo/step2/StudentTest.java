package oo.step2;

import oo.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void should_return_message_with_name_and_age_when_introduce_a_person_of_student(){
        Student student = new Student(1, "Tom", 18);

        assertEquals("My name is Tom. I am 18 years old. I am a student.", student.introduce());
    }

    @Test
    public void should_return_true_when_equals_two_same_id_student(){
        Student student = new Student(1, "Tom", 18);
        Student student2 = new Student(1, "Michael", 30);

        assertTrue(student.equals(student2));
    }

    @Test
    public void should_return_false_when_equals_two_different_id_student(){
        Student student = new Student(1, "Tom", 18);
        Student student2 = new Student(2, "Michael", 30);

        assertFalse(student.equals(student2));
    }
}
