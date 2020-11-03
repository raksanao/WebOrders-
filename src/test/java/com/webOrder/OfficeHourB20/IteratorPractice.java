package com.webOrder.OfficeHourB20;

import java.util.*;

public class IteratorPractice {
    public static void main(String[] args) {
        Set<Integer> str = new LinkedHashSet<>();
        str.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        Iterator<Integer> it = str.iterator();
        while (it.hasNext()) {
           Integer each=it.next();
           if(each<5){
               it.remove();
               System.out.println(each);
           }

        }
        System.out.println(str);
        List<Integer>names=new ArrayList<>();
        names.addAll(Arrays.asList(1,2,3,4,5,6,7));

        for (int i = 0; i <names.size() ; i++) {
            if(names.get(i)<5){
              //  System.out.println(names.get(i));
                names.removeIf(p ->p<5);
                System.out.println(names);
            }

        }




    }
}