package org.example.staticandfinal;

public class Student {

    private static int nextId = 1;
    private int id;

    public void setId() {
        id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public int getNextId() {
        return nextId;
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();

        student1.setId();
        System.out.println("student1.getNextId() = " + student1.getNextId());

        student2.setId();
        System.out.println("student2.getNextId() = " + student2.getNextId());

        student3.setId();
        System.out.println("student3.getNextId() = " + student3.getNextId());

        student4.setId();
        System.out.println("student4.getNextId() = " + student4.getNextId());
    }
}
