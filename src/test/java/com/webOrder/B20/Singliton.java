package com.webOrder.B20;

public class Singliton {
    private Singliton(){}
    private  static String word;
    public static String getWord(){

        if(word==null){
            System.out.println("First time call. Word object null and assigning value to this" );
            word="something";

        }else{
            System.out.println("word already have value");
        }
        return word;
    }
}
