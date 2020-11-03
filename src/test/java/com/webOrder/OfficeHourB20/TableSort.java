package com.webOrder.OfficeHourB20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/*lets say tehre is a table on web page and you sort it. This table was given to u as Set of String
* Verify if the table was sorted approprieatly*/
public class TableSort {
    public static void main(String[] args) {
Set<String>set=new LinkedHashSet<>(Arrays.asList("zbc","java","abra"));

        System.out.println(isSorted(set));
    }

    public static boolean isSorted(Set<String> set) {
        ArrayList<String>list=new ArrayList<>(set);
            for(int i=0;i<list.size()-1;i++){
                String first=list.get(i);
                String second=list.get(i+1);
                if(first.compareTo(second)>0){
                   return false;
                }
        }
        //compareTo
        return true;
    }
    }
