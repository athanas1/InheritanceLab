/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real.world.objects;

/**
 *
 * @author Alex
 */
public class Chrome implements WebBrowser {
    //Abstract method from WebBrowser
    @Override
    public void surfTheWeb() {
        System.out.println("Woah Dude! I'm Surfin'");
    }
    //Abstract method from SoftwareApplication
    @Override
    public void activateExecutable() {
        System.out.println("I am Pressing the Google Chrome Icon");
    }
    
}
