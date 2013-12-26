package javaswingcustomcomponentdemo.util;


import java.util.Random;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kanishka
 */
public class RandTextGen {
    public static String generateText(int textLength){
        Random rand=new Random(System.currentTimeMillis());
        StringBuilder stringB=new StringBuilder(textLength);
        for(int i=0;i<textLength;i++){
            int randNum=rand.nextInt(94);
            stringB.append((char) (randNum+32));
        }
        return stringB.toString();
    }
}
