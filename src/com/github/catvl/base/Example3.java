package com.github.catvl.base;

public class Example3 {
    public static void main(String[] args) {
        int var;
        double x;

        var = 10;
        x = 10.0;

        System.out.println("Переменной var изначально присвоенно значение: " + var);
        System.out.println("Переменной x изначально присвоенно значение: " + x);
        System.out.println();

        var = var/4;
        x = x/4;

        System.out.println("Значение переменной var после деления: " + var);
        System.out.println("Значение переменной x после деления: " + x);
    }
}
