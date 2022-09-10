package com.selflearning.basic;

import com.selflearning.basic.paring.ClassInfo;
import com.selflearning.basic.paring.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student std = new Student();
        std.setName("Chi Bao");
        // System.out.println(std.getName());

        std.setAge(20);
        // System.out.println(std.getAge());

        std.setClassId(12345L);
        // System.out.println(std.getClassId());


        List<Student> lstStudents = new ArrayList<>();
        lstStudents.add(std);

        ClassInfo cls = new ClassInfo();
        cls.setListStudents(lstStudents);

        System.out.println(cls.getListStudents().get(0).getAge());




    }
}
