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
public class Alpha extends Hero{
    
    public Alpha(){
        HP = 2646; AP = 121; MAGIC_AP = 0; ARMOR = 20; REGENERATION = 39;
        NAME = "ALPHA";
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
