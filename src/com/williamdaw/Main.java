package com.williamdaw;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean vaild = false;
        String repeat;
        while (!vaild) {
            ArrayList<String> wordlist2 = new ArrayList<String>();
            Scanner in = new Scanner(System.in);
            System.out.print("Please enter word 1: ");
            String word1 = in.nextLine();
            System.out.print("Please enter word 2: ");
            String word2 = in.nextLine();
            String[] word1list = word1.split("");
            String[] word2list = word2.split("");
            int score = word1list.length;
            for (int i = 0; i < word2.length(); i++) {
                wordlist2.add(word2list[i]);
            }
            for (String s : word1list) {
                for (int j = 0; j < wordlist2.size(); j++) {
                    if (Objects.equals(s, wordlist2.get(j))) {
                        wordlist2.remove(j);
                        score -= 1;
                        break;
                    }
                }
            }
            if (score == 0) {
                System.out.println(word1 + " is contained in " + word2);
            } else {
                System.out.println(word1 + " is not contained in " + word2);
            }
            System.out.print("Would you like to keep playing y or n: ");
            repeat = in.nextLine();
            if(repeat.toUpperCase(Locale.ROOT) == "N"){
                vaild = true;
            }
        }
    }
}
