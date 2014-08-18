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
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    
    @Override
    public void display() {
        System.out.println("I am a Mallard duck, gua,gua"); //To change body of generated methods, choose Tools | Templates.
    }
    
}
