package oo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private List<Klass> klasses = new ArrayList<>();

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        return String.format("My name is %s. I am %d years old. I am a teacher. I teach Class %s.",
                getName(),
                getAge(),
                klasses.stream().map(klass -> Integer.toString(klass.getNumber())).collect(Collectors.joining(", ")));
    }

    public boolean belongTo(Klass klass) {
        return this.klasses.contains(klass);
    }

    public void assignTo(Klass klass) {
        if (!this.klasses.contains(klass)) {
            this.klasses.add(klass);
        }
    }

    public boolean isTeaching(Student student) {
        return this.klasses.contains(student.getKlass());
    }
}
