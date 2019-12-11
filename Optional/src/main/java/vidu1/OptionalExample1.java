package vidu1;

import java.util.Optional;

class Student {
    String name;
}

public class OptionalExample1 {

    public void preJava8() {
        Student student = getStudent();
        if (student != null) {
            System.out.println(student.name);
        }
    }

    public void java8() {
        Student student = getStudent();
        Optional<Student> opt = Optional.of(student);
//        if (opt.isPresent()) {
//            System.out.println(opt.get().name);
//        }

         opt.ifPresent(s -> System.out.println(s.name));
    }

    private Student getStudent() {
        Student student = new Student();
        student.name = "gpcoder.com";
        return student;
    }

    public static void main(String[] args) {
        OptionalExample1 o = new OptionalExample1();
        o.getStudent();
        o.java8();
    }
}
