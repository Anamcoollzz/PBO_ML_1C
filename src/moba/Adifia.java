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
public class Adifia implements Player{

    protected String NICK_NAME;
    protected int MONEY;
    protected Player[] FRIENDS;
    protected Hero[] PAHLAWAN;
    
    Adifia(){
        NICK_NAME = "FAUZAL ADIFIA";
        MONEY = 2500;
    }
    
    @Override
    public String getNickName() {
        return NICK_NAME;
    }

    @Override
    public int getMoney() {
        return MONEY;
    }

    @Override
    public void setFriend() {
        FRIENDS = new Player[2];
        FRIENDS[0] = new HairulAnam();
        FRIENDS[1] = new YusufAuliya();
    }

    @Override
    public Player[] getFriends() {
        return FRIENDS;
    }
    
    @Override
    public void setHeroes() {
        PAHLAWAN = new Hero[2];
        PAHLAWAN[0] = new Akai();
        PAHLAWAN[1] = new Alpha();
    }

    @Override
    public Hero[] getHeroes() {
        return PAHLAWAN;
    }
    
}
