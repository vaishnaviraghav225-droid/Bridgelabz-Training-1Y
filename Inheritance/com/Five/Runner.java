package com.Five;

public class Runner {
    public static void main(String[] args) {

        Teacher t = new Teacher("Anita", 35, "Mathematics");
        Student s = new Student("Rahul", 16, "10th Grade");
        Staff st = new Staff("Ramesh", 40, "Administration");

        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}