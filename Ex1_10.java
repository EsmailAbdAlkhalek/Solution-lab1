/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1_10;

import javax.swing.JOptionPane;

/**
 *
 * @author SCC
 */
public class Ex1_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         JOptionPane.showMessageDialog(null, "my name is hal!. What Would you like to do");
         String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "I am sorry "+name+"I am afraid I can not do that");
    }
    
}
