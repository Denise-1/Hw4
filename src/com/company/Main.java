// Denise Chen
// IS 147-04
// d189@umbc.edu
// 11/28/2021
// using constructors to get 3 parameters

package com.company;

public class Main {
    public static void main(String[] args) {

// part 1 (Hw4 Class)
        System.out.println("Part 1: ");
        Hw4 newHw4 = new Hw4(23, 65, 90);
        String num1 = String.valueOf(newHw4.getNum1());
        String num2 = String.valueOf(newHw4.getNum2());
        String num3 = String.valueOf(newHw4.getNum3());
        System.out.println("The 3 numbers in the 3 argument constructor are: ");
        System.out.println(num1 + " " + num2 + " " + num3);

        System.out.println("-------------------------------");

// part 2 (StudentData class)
        System.out.println("Part 2: ");

        StudentData studentInfo = new StudentData(11345, "Denise", 21);
        System.out.println("Your student ID is: " + studentInfo.getStudentID());
        System.out.println("Your name is: " + studentInfo.getStudentName());
        System.out.println("Your are: " + studentInfo.getStudentAge() + " years old");

        /*This object creation would call the parameterized
         * constructor StudentData(int, String, int)*/
    }
}