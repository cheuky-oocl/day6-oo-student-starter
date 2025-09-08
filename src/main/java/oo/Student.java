package oo;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        if (klass != null && klass.getLeader() == this) {
            return String.format("My name is %s. I am %d years old. I am a student. I am the leader of class %d.", getName(), getAge(), klass.getNumber());
        }
        return String.format("My name is %s. I am %d years old. I am a student. I am in class %d.", getName(), getAge(), klass.getNumber());
    }

    public boolean isIn(Klass klass) {
        return this.klass != null && this.klass.equals(klass);
    }

    public void join(Klass klass) {
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }
}
