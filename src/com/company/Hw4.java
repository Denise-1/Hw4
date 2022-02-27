package com.company;

public class Hw4 {
//part 1
    String str;
    int num;
    int num1;
    int num2;
    int num3;

    public Hw4 (){      // default constructor
    }
    public Hw4 (String str){
        this();
//        System.out.println("Parametrized constructor with single param");
    }

    public Hw4 (String str, int num){
        this("string constructor ");     //It will call the constructor with String argument
//        System.out.println("Parametrized constructor with double args");
    }

    public Hw4 (int num1, int num2, int num3) {
        this("string constructor with int", 2);  // It will call the constructor with (String, integer) arguments
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
//        System.out.println("Parametrized constructor with three args");
    }

    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }
    public void setNum3(int num3) {
        this.num3 = num3;
    }
} // public class hw4 END