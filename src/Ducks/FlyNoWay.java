/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ducks;

/**
 *
 * @author howard
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I don't know how to fly");
    }
    
}
