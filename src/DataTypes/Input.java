/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataTypes;

import java.util.*;

/**
 *
 * @author howard
 */
public class Input {
    public static void main(java.lang.String[] args) {
// System.in is used as a arguments in class Scanner's constructor. We need to use scanner instance to get the input.       
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name?");
        java.lang.String name = in.nextLine(); // get a input as a string containing whitespace
        System.out.print("What is your first name?"); 
        java.lang.String firstName = in.next(); // get a input as a word 
        System.out.print("How old are you?"); 
        int age = in.nextInt(); // get a input as a integer
        
        System.out.println("Hello," + name + ". Next year, you'll be " + (age + 1));      
    }
    
}
