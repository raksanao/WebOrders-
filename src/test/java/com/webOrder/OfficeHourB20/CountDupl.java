package com.webOrder.OfficeHourB20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CountDupl {
    /*Write a programe to identify the frequency of duplicate words in a string.
    Print duplicates words and their frequency*/
    public static void main(String[] args) {
        countDups("Java is Java language is usuful Java");
    }

    public static void countDups(String s){
        ArrayList<String>words=new ArrayList<>(Arrays.asList(s.split(" ")));
        //convered String to arraylist of string
String cheked="";

        for (String word : words) {
            if (!cheked.contains(word)) {
                int freqOfEch = Collections.frequency(words, word);
                System.out.println( word + " " + freqOfEch);

                cheked += word + " ";

            }

        }
    }
}
