package com.webOrder.utilities;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils2 {

    public static List<String>getElementsText(List<WebElement>list){
        List<String>webelemntAsString=new ArrayList<>();
        for (WebElement each : list) {
            webelemntAsString.add(each.getText());

        }
        return webelemntAsString;










    }

    public static void wait(int sec){
        try{
            Thread.sleep(1000*sec);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }



}
