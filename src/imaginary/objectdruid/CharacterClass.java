/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imaginary.objectdruid;

/**
 *
 * @author L115student
 */
public abstract class CharacterClass implements Archetype {
    private final int STARTING_LEVEL = 1;
    public abstract void chooseAbility();
    public abstract void selectGender();
    
    public void startAdventure(){
        System.out.println("You have started your adventure at level " + STARTING_LEVEL);
    }
}
