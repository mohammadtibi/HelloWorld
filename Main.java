package com.jfrog.support.getorganized;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello get organized");
        Scanner s = new Scanner(System.in);
        System.out.println("please enter a number:");
        System.out.println(s.nextInt()%3);
    }
}
