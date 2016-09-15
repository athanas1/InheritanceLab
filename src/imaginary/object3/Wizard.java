/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imaginary.object3;

/**
 *
 * @author Alex
 */
public abstract class Wizard {
    public abstract int getMagicPower();
    
    public abstract void setMagicPower(int magicpower);
    
    public void castSpell() {
        System.out.println("Pew Pew");
    };
    
    public abstract void callPet();
    
}
