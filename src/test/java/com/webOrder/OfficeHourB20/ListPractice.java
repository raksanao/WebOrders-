package com.webOrder.OfficeHourB20;

import java.util.*;

public class ListPractice {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.addAll(Arrays.asList("ruxa","ruxa","fara","omar","sofik"));
        System.out.println(list);
        System.out.println(list.get(2));

        Stack<String>stack=new Stack<>();
        stack.addAll(list);
        System.out.println(stack);
        stack.pop();//LIFO
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);

    }
}
