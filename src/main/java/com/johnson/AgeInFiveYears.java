package com.johnson;

import java.util.Scanner;

public class AgeInFiveYears {

    public static void main(String[] args) {

        String name;
        int age;


        Scanner ask = new Scanner(System.in);
        System.out.println("Hi there. What's your name?");
        name = ask.nextLine();
        System.out.println("Hi " + name + "! My name is Bode. Nice to meet you.");
        System.out.println("How old are you?");
        age = ask.nextInt();

        int newAge = age + 5;
        int oldAge = age - 5;
        System.out.println("Did you know that in five years you will be " + newAge + " years old?");
        System.out.println("And five years ago you were " + oldAge + "! Imagine that!");

        ask.close();



    }


}

//
//3. Age in Five Years
//
//        Ask the user for their name.
//        Then display their name to prove that you can recall it.
//        Ask them for their age.
//        Then display what their age would be five years from now.
//        Then display what their age would be five years ago.
//
//        An example of your output could be:
//        Hi there. What's your name?
//        >Shahparan
//
//        Hi, Shahparan! My name is Java. Nice to meet you.
//        How old are you?
//        >31
//
//        Did you know that in five years you will be 36 years old?
//        And five years ago you were 26! Imagine that!