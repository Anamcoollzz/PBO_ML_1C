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
public abstract class Hero {
    protected int HP, AP, ARMOR, MAGIC_AP, REGENERATION;
    protected String NAME;
    public abstract void attackPhysical();
    public abstract void regenerationHP();
    public abstract void attackWithMagic();
    public abstract int getHP();
    public abstract int getArmor();
    protected String getName(){
        return NAME;
    }
}
