package com.company;

import java.util.*;

public class Main {


    public static void main(String[] args) {
//
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
        String choose = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("which would you like to buy (magazine or journal) ");
        choose = scanner.next();

        System.out.println("how much  money do have?");
        int money = scanner.nextInt();
        int magazineWorth = 15;
        int journalWorth = 25;
        int summ;
        if (money < magazineWorth) {
            System.out.println("you don't have enough money to purchase a magazine");
        } else if (money < journalWorth && money > magazineWorth) {
            System.out.println("you don't have enough money to purchase a  journal");
            System.out.println("But you have enough money to purchase  a magazine");
            System.out.println("would you like to purchase one ? ");
            System.out.println("Enter yes or no");
            choose = scanner.next();
            if (choose.equals("yes")) {
                summ = money - magazineWorth;
                System.out.println("thanks for the purchasing" + " " +
                        "your change is " + summ + " som");
            }
        } else if (choose.equals("magazine") && money > magazineWorth) {
            summ = money - magazineWorth;
            System.out.println(" thanks for the purchasing" + " " +
                    "your change is " + summ + " som");
        } else if (choose.equals("journal") && money > journalWorth) {
            summ = money - journalWorth;
            System.out.println("thanks for the purchasing " + "" +
                    "your change is " + summ + " som ");
        } else if (money == magazineWorth) {
            System.out.println("thanks for purchasing");
            System.out.println("thanks for the purchasing " + "" +
                    "your change is  0 som");
        } else if (money < journalWorth && money == magazineWorth) {
            System.out.println("you don't have enough money to purchase a journal, but you can purchase a magazine  ");
            System.out.println("Enter yes or no");
            choose = scanner.next();
            if (choose.equals("yes")) {
                summ = money - magazineWorth;
                System.out.println("thanks for the purchasing " + "" +
                        "your change is " + summ + " som ");
            }
        } else if (money < journalWorth && money > magazineWorth) {
            System.out.println("you  have enough money for a magazine but not enough one for a journal");
            System.out.println("would you like to purchase a magazine");
            choose = scanner.next();
            if (choose.equals("magazine")) {
                summ = money - magazineWorth;
                System.out.println("thanks for the purchasing" + " " +
                        "your change is " + summ + " som");
            }
        } else if (money == journalWorth) {
            System.out.println("thanks for purchasing");
            System.out.println("thanks for the purchasing " + "" +
                    "your change is  0 som");
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

        sum = x*x*x*x - x2*x2*x2 - y*y;
        System.out.println("sum = " + sum);

    }

    public static void threeth() {
        boolean checkFlag = true;
        char name = 0;


        System.out.println("Please enter last name");
        while (checkFlag) {

            boolean flag = true;

            Scanner scanner = new Scanner(System.in);
            String lastName = scanner.next();


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

                name = lastName.toUpperCase().charAt(0);
                lastName = lastName.substring(1);
                if (flag == true) {
                    System.out.println("registration is done!");

                    System.out.println("Result is " + name + lastName.toLowerCase(Locale.ENGLISH));
                    checkFlag = false;
                }


            } catch (Exception e) {
                e.printStackTrace();

            }


        }

    }

    public static void five() {
        Random random = new Random();
        Scanner scaner = new Scanner(System.in);

        try {

            int numbers = 0;
            int numbersPlus = 0;

            int[][] array = new int[100][100];
            System.out.println("enter numbers! ");
            int scan = scaner.nextInt();
            for (int i = 0; i < scan; i++)
                for (int j = 0; j < scan; j++) {
                    array[i][j] = random.nextInt(100) - 35;
                }
            for (int i = 0; i < scan; i++) {
                for (int j = 0; j < scan; j++) {

                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("after the operations : ");
            for (int i = 0; i < scan; i++) {
                for (int j = 0; j < scan; j++) {
                    if (array[i][j] > 0) {
                        numbersPlus += array[i][j];
                    } else
                        numbers += array[i][j];
                }

            }
            System.out.println();
            System.out.println("plus : " + numbersPlus);
            System.out.println("minus : " + numbers);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("enter numbers till 100");
        }

    }

    public static void one() {
        int num, k;
        System.out.println("enter numbers : ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        while (num > 0) {
            k = num % 10;
            num /= 10;
            System.out.print(k);


        }

    }

}


