package com.webOrder.OfficeHourB20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Duplicates_10_28 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,3,2,3,4,5,5,5,6));
        System.out.println(removeDup(list));
        System.out.println(dupl2(list));
    }
    /*create a method will take an integer ArrayList and
    removes any duplicate values.
     Return an Arraylist of unique elements*/
    public static ArrayList<Integer> removeDup(ArrayList<Integer> nums) {
        ArrayList<Integer> uniquesValue = new ArrayList<>();

        for (int each : nums) {
            if (!uniquesValue.contains(each)) {
                uniquesValue.add(each);

            }
        }
        return uniquesValue;

    }
    public static ArrayList<Integer>dupl2(ArrayList<Integer>nums){

        return new ArrayList<>(new TreeSet<>(nums));

    }
}
