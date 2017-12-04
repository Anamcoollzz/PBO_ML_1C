/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moba;

/**
 *
 * @author Hairul Anam
 */
public class AresBelt extends Items {

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void uniqueEffects() {
        System.out.println("Unique passive Starlight\nWhen HP is over 70%, the unique attribute for this");
    }
    
}
