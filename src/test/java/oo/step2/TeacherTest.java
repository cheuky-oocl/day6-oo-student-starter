package oo.step2;

import oo.Teacher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TeacherTest {

    @Test
    public void should_return_message_with_name_and_age_when_introduce_a_person_of_teacher(){
        Teacher teacher = new Teacher(1, "Jerry", 21);

        assertEquals("My name is Tom. I am 18 years old. I am a teacher", teacher.introduce());
    }

    @Test
    public void should_return_true_when_equals_two_same_id_teacher(){
        Teacher teacher = new Teacher(1, "Tom", 18);
        Teacher teacher2 = new Teacher(1, "Jerry", 21);

        assertTrue(teacher.equals(teacher2));
    }

    @Test
    public void should_return_false_when_equals_two_different_id_teacher(){
        Teacher teacher = new Teacher(1, "Tom", 18);
        Teacher teacher2 = new Teacher(2, "Jerry", 21);

        assertFalse(teacher.equals(teacher2));
    }
}
