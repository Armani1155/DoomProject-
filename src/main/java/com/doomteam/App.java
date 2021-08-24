package com.doomteam;

import java.io.Console;

import com.doomteam.choices.BinaryChoice;
import com.doomteam.utility.TerminalColor;

public class App {
    static Console c = System.console();
    static Person person = new Person();


    public static void chooseGender() {

        System.out.println("What gender would you like to be? Female, Male or Non-binary");
        String genderResponse = c.readLine();
        if (genderResponse.equalsIgnoreCase("Female")) {
            person.setGender(1);
        } else if (genderResponse.equalsIgnoreCase("Male")) {
            person.setGender(2);
        } else if (genderResponse.equalsIgnoreCase("Non-binary")) {
            person.setGender(3);
        } else {
            System.out.println("Please choose a gender listed"); // failsafe
            chooseGender();
        }

    }

    public static void homework() {
        System.out.println("You come home from 1st grade. Your mom tells you 'You need to do your math homework!' ");
        System.out.println("Do you do your math homework?"); // add a yes or no prompt

        BinaryChoice.choice(person, "Yes", "No", 5, -5, "You begin doing your math homework.",
                "You get a spanking for not studying. Your mom then forces you to study math.",
                BinaryChoice.REP_MODIFY);

        person.setAge(person.getAge() + 1);
        System.out.println("You've aged and are now " + person.getAge() + " years old.");
    }

    public static void pencil() {
        System.out.println("You head to class but your pencil breaks. ");
        System.out.println("Do you steal your classmates pencil?"); // add a yes or no prompt

        BinaryChoice.choice(person, "Yes", "No", -5, 0, "Your classmate sees you and tells the teacher",
                "You ask the teacher and the teacher gives you a pencil.", BinaryChoice.REP_MODIFY);

        person.setAge(person.getAge() + 1);
        System.out.println("You've aged and are now " + person.getAge() + " years old.");
    }

    public static void tag() {
        System.out.println("A kid comes to you and tags you.");
        System.out.println("Choose between STRANGER DANGER! or COME BACK HERE"); // puts a 1 on SD, puts a 2 on CBH

        BinaryChoice.choice(person, "STRANGER DANGER", "COME BACK HERE", -5, 5,
                "You punch the kid for no apparent reason.", "You befriend the kid", BinaryChoice.REP_MODIFY);
        person.setAge(person.getAge() + 1);
        System.out.println("You've aged and are now " + person.getAge() + " years old.");

    }

    public static void ditch() {
        System.out.println("A classmate asks if you wanna ditch class with them to play games.");
        System.out.println("Please choose; Schools boring! lets go!!! or No thanks, we got a test today!");

        BinaryChoice.choice(person, "Schools boring! lets go!!!", "No thanks", -5, 0,
                "Your mom spots you leaving school. She drags you by the ear back into school",
                "No thanks we got a test today!", BinaryChoice.REP_MODIFY);
        person.setAge(person.getAge() + 1);
        System.out.println("You've aged and are now " + person.getAge() + " years old.");
    }

    public static void dentalCare() {
        System.out.println("Your mom takes you to the dentist");
        System.out.println("How will you behave?");
        System.out.println("'Please choose Lets cause some trouble!' or 'The dentist is here to help me!'");
        BinaryChoice.choice(person, "Lets cause some trouble!", "The dentist is here to help me!", -15, +15,
                "Lets cause some trouble!", "No thanks we got a test today!", BinaryChoice.REP_MODIFY);
        person.setAge(person.getAge() + 1);

        System.out.println("You've aged and are now " + person.getAge() + " years old.");
    }

    public static void main(String[] args) {
        chooseGender();
        TerminalColor.printLine("For each of these prompts, you can enter 1 or 2 as well as the option name.",
                TerminalColor.PURPLE_BRIGHT);
        homework(); // now includes binary choice
        pencil();
        tag();
        ditch();
        dentalCare();

    }
}