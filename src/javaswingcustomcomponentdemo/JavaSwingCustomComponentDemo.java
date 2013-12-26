/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingcustomcomponentdemo;

import javax.swing.UIManager;

/**
 *
 * @author kanishka
 */
public class JavaSwingCustomComponentDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.nilo.plaf.nimrod.NimRODLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        CustCompoDemo cd = new CustCompoDemo();
        cd.setLocationRelativeTo(null);
        cd.setVisible(true);
    }
}
