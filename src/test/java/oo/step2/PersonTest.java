package oo.step2;

import oo.Person;
import oo.Student;
import oo.Teacher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    public void should_return_message_with_name_and_age_when_introduce_a_person_of_student(){
        Person person = new Student(1, "Tom", 18);

        assertEquals("My name is Tom. I am 18 years old. I am a student.", person.introduce());
    }

    @Test
    public void should_retrun_message_with_name_and_age_when_introduce_a_person_of_teacher(){
        Person person = new Teacher(1, "Jerry", 21);

        assertEquals("My name is Jerry. I am 21 years old. I am a teacher.", person.introduce());
    }
}
