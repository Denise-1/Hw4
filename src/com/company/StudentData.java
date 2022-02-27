package com.company;

public class StudentData {
// part 2
    private int studentID;
    private String studentName;
    private int studentAge;

    public StudentData (){      //default constructor
        int studentID;
        String studentName;
        int studentAge;
        }

    public StudentData (int newID, String newName, int newAge){
        this.studentID = newID;
        this.studentName = newName;
        this.studentAge = newAge;
    }

    public int getStudentID() {
        return studentID;
    }
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }
    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }
}