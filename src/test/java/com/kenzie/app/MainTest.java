package com.kenzie.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class MainTest {

    //Write a test method to check that the addGreeting method contains "Hello"
    @Test
    public void testAddGreetingContainsHello(){
        String inputStr = "jim";
        String expectedString = "Hello " + inputStr + "!";
        String actualString = Main.addGreeting( inputStr );
        assertEquals(expectedString,actualString);
    }

    //Write a test method to check that the addNumbers method works correctly
    @Test
    public void testAddNumbers(){
        int x = 2;
        int y = 3;
        int expectedNumber = 5;
        int actualNumber = Main.addNumbers(x,y);
        assertEquals(expectedNumber,actualNumber);

    }

    //Write a test method to check that the countCharacter method can be called with letters
    @Test
    public void testCountCharacterMatchLetters() {
        String inputString = "hello";
        char inputChar = 'l';
        int totalChar = 2;

       int expectedOutput = Main.countCharacter(inputChar,inputString);
       assertEquals(expectedOutput,totalChar);

    }

    //Test that countCharacter can be used to match punctuation characters
    @Test
    public void testCountCharacterMatchPunctuation() {
        String inputString = "gary!!!";
        char inputChar = '!';
        int totalChar = 3;

        int expectedOutput = Main.countCharacter(inputChar,inputString);
        assertEquals(expectedOutput,totalChar);
    }

    //Edge case: Test that countCharacter can handle an empty string
    @Test
    public void testCountCharactersEmptyString() {
        String inputString = "";
        char inputChar = 'w';
        int totalChar = 0;

        int expectedOutput = Main.countCharacter(inputChar,inputString);
        assertEquals(expectedOutput,totalChar);
    }

    //Edge case: Test that countCharacter can handle case-insensitive matching
    //Write this unit test first. When countCharacter fails this test -- then go and fix the countCharacter method in Main.java
    @Test
    public void testCountCharacterMatchAnyCase() {
        String inputString= "garAAY!!";
        char inputChar = 'A';
        int totalChar = 2;

        int expectedOutput = Main.countCharacter(inputChar,inputString);
        assertEquals(expectedOutput,totalChar);

    }


}

