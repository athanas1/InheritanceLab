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
public class HarryPotter extends HogwartStudent {
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

    @Override
    public void attendClass() {
        System.out.println("Harry attended class");}


    @Override
    public void callPet() {
        System.out.println("Harry call Hedwig");}
    
}
