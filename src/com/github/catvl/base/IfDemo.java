package com.github.catvl.base;

public class IfDemo {
    public static void main(String[] args) {
        int a,b,c;

        a = 2;
        b = 3;

        if (a<b) System.out.println("a меньше b");
        if (a==b) System.out.println("Вы не должны увидеть этот текст");
        System.out.println();

        c=a-b;

        System.out.println("c содержит: " + c);
        if(c>=0) System.out.println("c - неотрицательное число");
        if(c<0) System.out.println("с - отрицательное число");
        System.out.println();

        c=b-a;
        System.out.println("c содержит: " + c);
        if(c>=0) System.out.println("c - неотрицательное число");
        if(c<0) System.out.println("с - отрицательное число");
    }
}
