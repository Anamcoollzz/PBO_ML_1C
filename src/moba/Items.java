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
public abstract class Items {
    protected String TYPE, NAME, EFFECT;
    protected abstract String getType();
    protected abstract String getName();
    public String getEffect(){
        return EFFECT;
    }
    
    public abstract void uniqueEffects();
    
}
