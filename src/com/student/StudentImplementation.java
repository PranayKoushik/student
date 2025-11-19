package com.student;

import java.util.ArrayList;
import java.util.List;

public class StudentImplementation implements StudentOperations {

    // ArrayList to store all students
    List<student> list = new ArrayList<>();

    // -----------------------------------------------------
    // 1. ADD STUDENT
    // -----------------------------------------------------
    @Override
    public student addstudent(int sid) {

        // Create student with default name and age
        student s = new student(sid, "Student_" + sid, 20);

        list.add(s);

        System.out.println("Student added: " + s.getSid() + " - " + s.getName());
        return s;
    }

    // -----------------------------------------------------
    // 2. GET STUDENT BY NAME
    // -----------------------------------------------------
    @Override
    public student getstudent(String name) {

        for (student s : list) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;  // Not found
    }

    // -----------------------------------------------------
    // 3. SET STUDENT (update student details)
    // -----------------------------------------------------
    @Override
    public student setstudent(String name, int sid, int age) {

        for (student s : list) {
            if (s.getName().equalsIgnoreCase(name)) {

                s.setSid(sid);
                s.setAge(age);

                System.out.println("Student updated: " + name);
                return s;
            }
        }
        return null; // Not found
    }

    // -----------------------------------------------------
    // 4. REMOVE STUDENT
    // -----------------------------------------------------
    @Override
    public student removestudent(int sid) {
    	
        for (student s : list) {
            if (s.getSid() == sid) {
                list.remove(s);
                System.out.println("Student removed ID: " + sid);
                return s;
            }
        }
		return null;

    }

    // -----------------------------------------------------
    // 5. CHECK IF STUDENT NAME EXISTS (containsStudent)
    // -----------------------------------------------------
    @Override
    public student containsstudent(String name) {
    	 for (student s : list) {
             if (s.getName().equalsIgnoreCase(name)) {
                 return s;
             }
         }

		return null;


    }

    // -----------------------------------------------------
    // 6. FIND STUDENT WITH HIGHEST AGE
    // -----------------------------------------------------
    @Override
    public student highestagestudent(int age) {
    	
    	 @SuppressWarnings("unused")
		 student max = null;
         int maxAge = -1;

         for (student s : list) {
             if (s.getAge() > maxAge) {
                 maxAge = s.getAge();
                 max = s;
             }
         }

		return null;

     
    }
}
