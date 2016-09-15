/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real.world.objectps4;

/**
 *
 * @author L115student
 */
public abstract class VideoGameConsole implements Console {
    private int controllerNumber;

    @Override
    public void output() {
        System.out.println("The output of all game consoles is screen");}

    @Override
    public void input() {
        System.out.println("The input of all consoles is some sort of Controller");}
   
    public abstract void executeCartridge();
    
    public void activateController(int controllerNumber){
        System.out.println("You have activated Controller number " + controllerNumber);
    }

    public final int getControllerNumber() {
        return controllerNumber;
    }

    public void setControllerNumber(int controllerNumber) {
        // validation
        this.controllerNumber = controllerNumber;
    }
    
}
