package oo;

import java.util.Objects;

public class Klass {
    private int number;
    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Klass klass = (Klass) o;
        return number == klass.number;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(number);
    }

    public int getNumber() {
        return number;
    }

    public void assignLeader(Student student) {
        if (student.getKlass() == this) {
            this.leader = student;
        }
        System.out.println("It is not one of us.");
    }

    public boolean isLeader(Student student) {
        return (this.leader == student);
    }

    public Student getLeader() {
        return leader;
    }
}
