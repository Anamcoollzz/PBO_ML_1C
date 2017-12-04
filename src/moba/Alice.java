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
public class Alice extends Hero{
    
    public Alice(){
        HP = 2397; AP = 109; MAGIC_AP = 0; ARMOR = 21; REGENERATION = 36;
        NAME = "ALICE";
    }
    
    @Override
    public void attackPhysical() {
        System.out.println("Saya menyerang musuh sebesar "+AP);
    }

    @Override
    public void regenerationHP() {
        System.out.println("Saya regenerasi sebesar "+REGENERATION);
    }

    @Override
    public void attackWithMagic() {
        System.out.println("Saya menyerang dengan magic sebesar "+MAGIC_AP);
    }

    @Override
    public int getHP() {
        return HP;
    }

    @Override
    public int getArmor() {
        return ARMOR;
    }
    
}
