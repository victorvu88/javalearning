package com.selflearning.basic.paring;

import java.util.List;

public class ClassInfo {
    private String nameClass;
    private String nameTeacher;
    private List<Student> listStudents;

    public void setNameClass(String nameClassToSet) {
        nameClass = nameClassToSet;
    }
    public String getNameClass() {
        return nameClass;
    }

    public void setNameTeacher(String nameTeacherToSet) {
        nameTeacher = nameTeacherToSet;
    }
    public String getNameTeacher() {
        return nameTeacher;
    }

    public List<Student> getListStudents() {
        return listStudents;
    }

    public void setListStudents(List<Student> listStudents) {
        this.listStudents = listStudents;
    }
}

