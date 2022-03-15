package edu.tr.maltepe.oop;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setId(1);
        person1.setName("ali");
        person1.setSurname("alizada");
        person1.setAge(21);

        Student student1 = new Student();
        student1.setId(2);
        student1.setName("noor");
        student1.setSurname("awsher");
        student1.setAge(21);
        student1.setStudentNumber(190706040);

        Professor professor1 = new Professor();
        professor1.setId(3);
        professor1.setName("Ensar");
        professor1.setSurname("Gül");
        professor1.setAge(30);
        professor1.setProfessorNumber(3578654);

        System.out.println("Person 1 : " + person1.getName() + " " + person1.getSurname());
        System.out.println("Age : " + person1.getAge());

        System.out.println("Student 1 : " + student1.getName() + " " + student1.getSurname());
        System.out.println("Age : " + student1.getAge());
        System.out.printl
    ("Student Number : " + student1.getStudentNumber());

        System.out.println("Professor : " + professor1.getName() + " " + professor1.getSurname());
        System.out.println("Age : " + professor1.getAge());
        System.out.println("Professor Number : " + professor1.getProfessorNumber());


        professor1.teach();
        student1.learn();
        student1.talks();
        professor1.talks();


    }
}
