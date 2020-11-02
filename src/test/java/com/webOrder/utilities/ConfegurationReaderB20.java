package com.webOrder.utilities;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfegurationReaderB20 {
private static Properties properties=new Properties();

static {
    try {


        FileInputStream file = new FileInputStream("configuration.properties");
    }catch (FileNotFoundException e){
        System.out.println("Properties not found");
    }

}
public static String getProperties(String keyWord){
    return  properties.getProperty(keyWord);
}
}
