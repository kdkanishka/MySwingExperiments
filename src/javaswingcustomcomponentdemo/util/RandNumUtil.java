/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingcustomcomponentdemo.util;

import java.util.Random;

/**
 *
 * @author kanishka
 */
public class RandNumUtil {
    public static int getRandInt(int max){
        Random rand=new Random(System.currentTimeMillis());
        return rand.nextInt(max);
    }
}
