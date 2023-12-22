package com.infy.assignment.collection;

import java.util.HashSet;

public class Student {
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                '}';
    }

    @Override
    public int hashCode() {
        return rollNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return rollNumber == student.rollNumber;
    }

    public static void main(String[] args) {
        HashSet<Student> studentSet = new HashSet<>();

        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);
        Student student3 = new Student("Alice", 101); // Duplicate of student1
        Student student4 = new Student("Charlie", 103);

        // Adding students to HashSet
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3); // This duplicate won't be added
        studentSet.add(student4);

        // Displaying students in the HashSet
        System.out.println("Students in the HashSet:");
        for (Student student : studentSet) {
            System.out.println(student);
        }
    }
}
