package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner =new Scanner(in);
        System.out.println("Yilni kiriting:  ");
        int year = scanner.nextInt();

        if (   (year % 4 == 0) &&   (year % 100 != 0) ||  (year % 400 == 0) ) {
            System.out.println("Kabisa yili  ");

        } else {
            System.out.println("Kabisa yili emas   ");
        }
    }







    }

