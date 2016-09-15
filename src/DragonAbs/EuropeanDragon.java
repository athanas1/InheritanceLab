/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DragonAbs;

/**
 *
 * @author Alex
 */
public class EuropeanDragon extends Dragon {
    // method from Dragon
    @Override
    public void breatheFire() {
        System.out.println("I breathe fire on you to kill you!");
    }
    // method from MythoCreature
    @Override
    public void giveGift() {
        System.out.println("My gift to you is death!");
    }
    
    public void hoardTreasure(){
        System.out.println("I am a European Dragon, I hoard treasure!");
    }
  
    
}

