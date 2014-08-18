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
public class MiniDuck {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        mallard.display();
        
        Duck model = new ModelDuck();
        model.performQuack();
        model.performFly();
        model.display();
        System.out.println("Transforming!");
        model.setFlyBehavior(new Rocket());
        model.setQuackBehavior(new Quack());
        model.performQuack();
        model.performFly();
        
    }
    
}
