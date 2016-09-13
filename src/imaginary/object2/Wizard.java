/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imaginary.object2;

/**
 *
 * @author Alex
 */
public class Wizard {
    // all wizards have some sort of Magic Power
   public int magicPower;
   
   public int getMagicPower(){
       return magicPower;
   }

    public void setMagicPower(int magicPower) {
        //need validation
        this.magicPower = magicPower;
    }
    // all wizards cast spells
    public void castSpell(){
        System.out.println("Pew Pew I cast a spell");
    }
   
}
