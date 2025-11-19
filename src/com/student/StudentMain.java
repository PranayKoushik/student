                                                                                                                                               package com.student;

public class StudentMain {

    public static void main(String[] args) {

        StudentImplementation obj = new StudentImplementation();

        // 1. Add Students
        obj.addstudent(101);
        obj.addstudent(102);
        obj.addstudent(103);

        // 2. Get a Student by Name
        student s = obj.getstudent("Student_101");
        if (s != null)
            System.out.println("Found: " + s.getName() + " Age: " + s.getAge());

        // 3. Update Student
        obj.setstudent("Student_102", 202, 25);

        // 4. Remove Student
        obj.removestudent(103);

        // 5. Check if student name exists
        student s2 = obj.containsstudent("Student_202");
        if (s2 != null)
            System.out.println("Student Exists: " + s2.getName());

        // 6. Find student with highest age
        student max = obj.highestagestudent(0);
        if (max != null)
            System.out.println("Highest Age Student: " + max.getName());
    }
}