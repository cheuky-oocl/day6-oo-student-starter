package oo.step4;

import oo.Klass;
import oo.Student;
import oo.Teacher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TeacherTest {

    @Test
    public void should_return_false_when_belongs_to_given_teacher_does_not_teach_the_class(){
        Teacher teacher = new Teacher(1, "Jerry", 21);
        Klass klass = new Klass(1);

        assertFalse(teacher.belongTo(klass));
    }

    @Test
    public void should_return_true_when_belongs_to_given_teacher_teach_the_class(){
        Teacher teacher = new Teacher(1, "Jerry", 21);
        Klass klass = new Klass(1);
        teacher.assignTo(klass);

        assertTrue(teacher.belongTo(klass));
    }

    @Test
    public void should_return_true_when_belongs_to_given_teacher_teach_multiple_classes(){
        Teacher teacher = new Teacher(1, "Jerry", 21);
        Klass klass = new Klass(1);
        Klass klass2 = new Klass(2);
        teacher.assignTo(klass);
        teacher.assignTo(klass2);

        assertTrue(teacher.belongTo(klass));
        assertTrue(teacher.belongTo(klass2));
    }

    @Test
    public void should_return_message_when_introduce_given_teacher_teach_one_class(){
        Teacher teacher = new Teacher(1, "Jerry", 21);
        Klass klass = new Klass(1);
        teacher.assignTo(klass);

        assertEquals("My name is Jerry. I am 21 years old. I am a teacher. I teach Class 1.", teacher.introduce());
    }

    @Test
    public void should_return_message_when_introduce_given_teacher_teach_multiple_class(){
        Teacher teacher = new Teacher(1, "Jerry", 21);
        Klass klass = new Klass(1);
        Klass klass2 = new Klass(2);
        teacher.assignTo(klass);
        teacher.assignTo(klass2);

        assertEquals("My name is Jerry. I am 21 years old. I am a teacher. I teach Class 1, 2.", teacher.introduce());
    }

    @Test
    public void should_return_false_when_isTeaching_given_student_not_in_the_class_taught_by_teacher(){
        Teacher teacher = new Teacher(1, "Jerry", 21);
        Student student = new Student(1, "Tom", 18);
        Klass klass = new Klass(1);
        teacher.assignTo(klass);

        assertFalse(teacher.isTeaching(student));
    }

    @Test
    public void should_return_true_when_isTeaching_given_student_in_the_class_taught_by_teacher(){
        Teacher teacher = new Teacher(1, "Jerry", 21);
        Student student = new Student(1, "Tom", 18);
        Klass klass = new Klass(1);
        student.join(klass);
        teacher.assignTo(klass);

        assertTrue(teacher.isTeaching(student));
    }

    @Test
    public void should_return_true_when_isTeaching_given_student_in_any_class_taught_by_teacher(){
        Teacher teacher = new Teacher(1, "Jerry", 21);
        Student student = new Student(1, "Tom", 18);
        Klass klass = new Klass(1);
        Klass klass2 = new Klass(2);
        student.join(klass);
        teacher.assignTo(klass);
        teacher.assignTo(klass2);

        assertTrue(teacher.isTeaching(student));
    }
}
