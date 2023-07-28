package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("***** Mecca Al-Mukarramah *****");
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Age ^_^:");
        int age = input.nextInt();

        System.out.println("Please Enter Your Gender (m,f) ^_^:");
        String str= input.next();
        char gender = str.charAt(0);

        if (str.length()>1){
            System.out.println("invalid gender  ");
        }

        if (str.equalsIgnoreCase("m")) {
            if (age >= 18) {
                System.out.println("Allow to travel in mecca ");
            }
        }
        else if (str.equalsIgnoreCase("f")){
            if (age>=45){
                System.out.println("To Allow Travel in mecca , traveling within a group");
            }
            else
                System.out.println("To Allow Travel in mecca , should have a Mahram");
            }



        }
    }
