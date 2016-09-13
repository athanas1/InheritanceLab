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
public abstract class Dragon extends MythologicalCreature {
    // taking the abstractions from MythoCreature and overriding them
    private int age;

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        // validation
        this.age = age;
    }
   
    public abstract void breatheFire();
}
