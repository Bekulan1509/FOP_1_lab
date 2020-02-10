package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        one();
        System.out.println("-----------------------------------");
        five();
        System.out.println("-----------------------------------");
        threeth();
        System.out.println("-----------------------------------");
        forth();
        System.out.println("-----------------------------------");
        second();
        System.out.println("-----------------------------------");


    }

    public static void second() {
        System.out.println("which would you like to buy (magazine or journal) ");
        Scanner scanner = new Scanner(System.in);
        String choose = scanner.next();
        System.out.println("how much  money do have?");
        int money = scanner.nextInt();
        int magazineWorth = 15;
        int journalWorth = 25;
        int summ;
        if (choose.equals("magazine")) {
            summ = money - magazineWorth;
            System.out.println(" thanks for the purchasing" + " " +
                    "your change is " + summ + " som");
        } else if (choose.equals("journal")) {
            summ = money - journalWorth;
            System.out.println("thanks for the purchasing " + "" +
                    "your change is " + summ + " som ");


        }

    }

    public static void forth() {
        int sum;
        int x;
        int x2;
        int y;
        System.out.println("enter x number : ");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        System.out.println("enter x number : ");
        x2 = scanner.nextInt();
        System.out.println("enter y number : ");
        y = scanner.nextInt();

        sum = x2 * x2 * x2 + y * y - x * x * x * x;
        System.out.println("sum = " + sum);

    }

    public static void threeth() {
        boolean checkFlag = true;


        System.out.println("Please enter last name");
        while (checkFlag) {

            boolean flag = true;

            Scanner scanner = new Scanner(System.in);
            String lastName = scanner.next();
            char name = lastName.toUpperCase().charAt(0);
            lastName = lastName.substring(1);


            try {
                String numbers = "1234567890^%$#@!*()-={+|/?";
                char[] nums = numbers.toCharArray();
                for (int i = 0; i < lastName.length(); i++) {
                    for (int j = 0; j < nums.length; j++) {
                        if ((lastName.charAt(i) == nums[j] && flag) == true) {
                            String error = "there are supposed to be only letters";
                            System.err.println(error);
                            flag = false;
                        }

                    }


                }
                if (flag == true) {
                    System.out.println("registration is done!");

                    System.out.println("Result is " + name + lastName);
                    checkFlag = false;
                }


            } catch (Exception e) {
                e.printStackTrace();

            }


        }

    }

    public static void five() {
        Random random = new Random();
        int numbers = 0;
        int numbersPlus = 0;

        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(100) - 35;
            }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("after the operations : ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] > 0) {
                    numbersPlus += array[i][j];
                } else
                    numbers += array[i][j];
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("plus : " + numbersPlus);
        System.out.println("minus : " + numbers);


    }

    public static void one() {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
         while (flag) {
        System.out.println("введите  цифры если хотите остановиться напишите stop на англиском : ");
        String numbers = scanner.next();
        Collections.reverse(arrayList);
        arrayList.add(numbers);
        if (numbers.equals("stop")) {
            flag = false;
        }
             System.out.println("----------------------");
             Collections.reverse(arrayList);
             for (int i =0; i < arrayList.size(); i++) {
                 System.out.println(arrayList.get(i));
             }

         }


    }


}


