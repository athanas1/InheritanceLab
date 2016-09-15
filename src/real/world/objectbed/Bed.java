/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real.world.objectbed;

/**
 *
 * @author L115student
 */
public class Bed extends Furniture {

    @Override
    public void useOfObject() {
        System.out.println("I am used for sleeping");}

    @Override
    public void rolling() {
        System.out.println("I cannot roll, I have four legs on the ground");}
    
    
    
}
