package com.webOrder.pages.practice;

public class Singilton {

 private Singilton(){}

     static String str;
     public static String getInstance(){
         if(str==null){
             System.out.println("asign value to it");
             str="Ice cream was good";

         }else{
             System.out.println("It has already value");
         }
return str;

    }
}
