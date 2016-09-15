/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imaginary.object1;

/**
 *
 * @author Alex
 */
public abstract class HogwartStudent implements Wizard {
    private int magicPower;
    
   @Override
   public  int getMagicPower(){
       return magicPower;
   };
    
   @Override
    public void setMagicPower(int magicpower){
        //validation
        this.magicPower = magicPower;
    };
    public abstract void attendClass();
    
    
     
}
