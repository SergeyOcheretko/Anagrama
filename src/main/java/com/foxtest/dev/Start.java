package com.foxtest.dev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your string: ");
        String input = br.readLine();
        System.out.println("Input string: " + "\n" + input);
        System.out.println("Output string: " + "\n" + Reverse.reverseAlphabeticChars(input));
    }

}
