package com.selflearning.basic.paring;

 public class Student {
    private String name;
    private int age;
    private Long classId;

    public void setName(String nameToSet) {
        name = nameToSet;
    }

    public String getName() {
        return name;
    }

    public void setAge(int ageToSet) {
        age = ageToSet;
    }
    public int getAge() {
        return age;

    }
    public void setClassId (Long classIdToSet ) {
        classId = classIdToSet;
    }
    public Long getClassId() {
        return classId;
    }
}


