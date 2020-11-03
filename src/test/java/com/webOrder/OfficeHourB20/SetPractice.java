package com.webOrder.OfficeHourB20;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {
        String name[]={"Ruxa","Aziza","fara","fara"};
        Set<String> hashSet=new HashSet<>();
        hashSet.addAll(Arrays.asList(name));
        System.out.println(hashSet);


        Set<String>linkHashSet=new LinkedHashSet<>();
        linkHashSet.addAll(Arrays.asList(name));
        System.out.println(linkHashSet);
        Set<String>treeSet=new TreeSet<>();
        treeSet.addAll(Arrays.asList(name));
        System.out.println(treeSet);
         Integer num[]={5,7,1,1,2,3,4,4};
        Set<Integer>numb=new HashSet<>();
        numb.addAll(Arrays.asList(num));
        System.out.println(numb);
    }
}
