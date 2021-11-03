package com.company;

public class Main {

    public static void main(String[] args) {
        student Student = new student();
        Student.name = "garp";
        Student.age = 39;

        student Student2 = new student();
        Student2.name = "4epw";
        Student2.age = 25;

        System.out.println("Student1 " + Student.name + " " + Student.age);
        System.out.println("Student2 " + Student2.name + " " + Student2.age);
    }
}
